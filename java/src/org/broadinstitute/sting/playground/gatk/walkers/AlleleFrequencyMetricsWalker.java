package org.broadinstitute.sting.playground.gatk.walkers;

import org.broadinstitute.sting.gatk.refdata.ReferenceOrderedDatum;
import org.broadinstitute.sting.gatk.refdata.rodDbSNP;
import org.broadinstitute.sting.gatk.refdata.rodGFF;
import org.broadinstitute.sting.gatk.walkers.BasicLociWalker;
import org.broadinstitute.sting.gatk.LocusContext;
import org.broadinstitute.sting.playground.gatk.walkers.AlleleFrequencyWalker;
import org.broadinstitute.sting.playground.utils.AlleleFrequencyEstimate;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: andrewk
 * Date: Mar 18, 2009
 * Time: 5:28:58 PM
 * To change this template use File | Settings | File Templates.
 */

public class AlleleFrequencyMetricsWalker extends BasicLociWalker<AlleleFrequencyEstimate, String> 
{

    long dbsnp_hits=0;
    long num_variants=0;
    long num_loci_total=0;
    long num_loci_confident=0;
    double LOD_cutoff = 5;
    long hapmap_genotype_correct = 0;
    long hapmap_genotype_incorrect = 0;
    long hapmap_refvar_correct = 0;
    long hapmap_refvar_incorrect = 0;

    AlleleFrequencyWalker caller;

    public AlleleFrequencyEstimate map(List<ReferenceOrderedDatum> rodData, char ref, LocusContext context) 
    {
        AlleleFrequencyEstimate alleleFreq = caller.map(rodData, ref, context);

        num_loci_total += 1;

        boolean is_dbSNP_SNP = false;
        boolean has_hapmap_chip_genotype = false;
        rodGFF hapmap_chip_genotype = null;

        for ( ReferenceOrderedDatum datum : rodData )
        {
            if ( datum != null )
            {
                if ( datum instanceof rodDbSNP )
                {
                    rodDbSNP dbsnp = (rodDbSNP)datum;
                    if (dbsnp.isSNP()) is_dbSNP_SNP = true;
                }

                if ( datum instanceof rodGFF )
                {
                    has_hapmap_chip_genotype = true;
                    hapmap_chip_genotype = (rodGFF)datum;
                }
            }
        }

        if (Math.abs(alleleFreq.LOD) >= LOD_cutoff) { num_loci_confident += 1; }

        if (alleleFreq.qstar > 0.0 && alleleFreq.LOD >= LOD_cutoff)
        { 
            // Confident variant.
           
            num_variants += 1;

            if (is_dbSNP_SNP)
            {
                dbsnp_hits += 1;
            }
        }

        // Convert qstar and LOD to give best qstar and a positive LOD for that qstar
        double qstar;
        double LOD;
        if (alleleFreq.LOD < 0) {
            qstar = 0.0;
            LOD = -1 * alleleFreq.LOD;
        }else{
            qstar = alleleFreq.qstar;
            LOD = alleleFreq.LOD;
        }                              

        //long confident_calls_at_hapmap_chip_sites = 0;
        if (LOD >= LOD_cutoff && has_hapmap_chip_genotype) {
            //confident_calls_at_hapmap_chip_sites++;

            // convert hapmap call to mixture of ref/nonref
            String hapmap_genotype = hapmap_chip_genotype.getFeature();
            long refs=0, alts=0;
            double hapmap_q;

            for (char c : hapmap_genotype.toCharArray()) {
                if (c == alleleFreq.ref) { refs++; }
                if (c == alleleFreq.alt) { alts++; }
            }

            if (refs+alts > 0) {
                hapmap_q = (float)alts / (refs+alts);
            }else{
                hapmap_q = -1;
            }

            // Hapmap debug info
            System.out.format("HAPMAP %.2f %.2f %.2f ", hapmap_q, qstar, LOD);
            String called_genotype = alleleFreq.asString();
            System.out.format("%s %s %c %c %.2f", hapmap_genotype, called_genotype, alleleFreq.ref, alleleFreq.alt, alleleFreq.LOD);

            // Calculate genotyping performance - did we get the correct genotype of the N+1 choices?
            if (hapmap_q != -1 && hapmap_q == qstar) {
                hapmap_genotype_correct++;
                System.out.print("\n");
            }else{
                hapmap_genotype_incorrect++;
                System.out.printf(" INCORRECT GENOTYPE Bases: %s\n", AlleleFrequencyWalker.getBases(context));
                AlleleFrequencyWalker.print_base_qual_matrix(AlleleFrequencyWalker.getOneBaseQuals(context));
            }

            // Now calculate ref / var performance - did we correctly classify the site as
            // reference or variant without regard to genotype; i.e. het/hom "miscalls" don't matter here
            boolean hapmap_var = hapmap_q != 0.0;
            boolean called_var = qstar != 0.0;
            if (hapmap_var != called_var) {
                hapmap_refvar_incorrect++;
            }else{
                hapmap_refvar_correct++;
            }

        }

        /*String hapmap_genotype = hapmap_chip_genotype.getFeature();
        String called_genotype = alleleFreq.asString();
        System.out.format("HAPMAP %s %s %.2f\n", hapmap_genotype, called_genotype, alleleFreq.LOD);
        // There is a hapmap site here, is it correct?
        if (hapmap_genotype.equals(called_genotype))
        {
            hapmap_tp++;
        } else {
            hapmap_fp++;
        } */

        return alleleFreq;
    }

    public void printMetrics()
    {
        if (num_loci_total == 0) { return; }

        System.out.printf("\n");
        System.out.printf("METRICS Allele Frequency Metrics (LOD >= %.0f)\n", LOD_cutoff);
        System.out.printf("METRICS -------------------------------------------------\n");
        System.out.printf("METRICS Total loci                            : %d\n", num_loci_total);
        System.out.printf("METRICS Total called with confidence          : %d (%.2f%%)\n", num_loci_confident, 100.0 * (float)num_loci_confident / (float)num_loci_total);
        if (num_variants != 0)
        {
	        System.out.printf("METRICS Number of variants                    : %d (%.2f%%) (1/%d)\n", num_variants, 100.0 * (float)num_variants / (float)num_loci_confident, num_loci_confident / num_variants);
            System.out.printf("METRICS Fraction of variant sites in dbSNP    : %.2f%%\n", 100.0 * (float)dbsnp_hits / (float)num_variants);
            System.out.printf("METRICS -------------------------------------------------\n");
            System.out.printf("METRICS        -- Hapmap Genotyping performance --\n");
            System.out.printf("METRICS Num. conf. calls at Hapmap chip sites : %d\n", hapmap_genotype_correct + hapmap_genotype_incorrect);
            System.out.printf("METRICS Conf. calls at chip sites correct     : %d\n", hapmap_genotype_correct);
            System.out.printf("METRICS Conf. calls at chip sites incorrect   : %d\n", hapmap_genotype_incorrect);
            System.out.printf("METRICS %% of confident calls that are correct : %.2f%%\n", 100.0 * (float) hapmap_genotype_correct / (float)(hapmap_genotype_correct + hapmap_genotype_incorrect));
            System.out.printf("METRICS -------------------------------------------------\n");
            System.out.printf("METRICS    -- Hapmap Reference/Variant performance --\n");
            System.out.printf("METRICS Num. conf. calls at Hapmap chip sites : %d\n", hapmap_refvar_correct + hapmap_refvar_incorrect);
            System.out.printf("METRICS Conf. calls at chip sites correct     : %d\n", hapmap_refvar_correct);
            System.out.printf("METRICS Conf. calls at chip sites incorrect   : %d\n", hapmap_refvar_incorrect);
            System.out.printf("METRICS %% of confident calls that are correct : %.2f%%\n", 100.0 * (float) hapmap_refvar_correct / (float)(hapmap_refvar_correct + hapmap_refvar_incorrect));
        }
        System.out.println();
    }

    public void onTraversalDone() 
    {
        printMetrics();
    }

    public String reduceInit() 
    { 
        caller = new AlleleFrequencyWalker();
        return ""; 
    }

    public String reduce(AlleleFrequencyEstimate alleleFreq, String sum) 
    {
        // Print RESULT data for confident calls
        if ((alleleFreq.LOD >= 5) || (alleleFreq.LOD <= -5)) { System.out.print(alleleFreq.asTabularString()); }

        if (this.num_loci_total % 10000 == 0) { printMetrics(); }

        return "null";
    }

    
}
