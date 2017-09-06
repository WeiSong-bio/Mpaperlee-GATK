/*
* By downloading the PROGRAM you agree to the following terms of use:
* 
* BROAD INSTITUTE
* SOFTWARE LICENSE AGREEMENT
* FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
* 
* This Agreement is made between the Broad Institute, Inc. with a principal address at 415 Main Street, Cambridge, MA 02142 ("BROAD") and the LICENSEE and is effective at the date the downloading is completed ("EFFECTIVE DATE").
* 
* WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
* WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
* NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
* 
* 1. DEFINITIONS
* 1.1 PROGRAM shall mean copyright in the object code and source code known as GATK3 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute.org/gatk on the EFFECTIVE DATE.
* 
* 2. LICENSE
* 2.1 Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. LICENSEE hereby automatically grants to BROAD a non-exclusive, royalty-free, irrevocable license to any LICENSEE bug fixes or modifications to the PROGRAM with unlimited rights to sublicense and/or distribute.  LICENSEE agrees to provide any such modifications and bug fixes to BROAD promptly upon their creation.
* The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only. For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
* 2.2 No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD. LICENSEE shall ensure that all of its users agree to the terms of this Agreement. LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
* 2.3 License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.
* 
* 3. PHONE-HOME FEATURE
* LICENSEE expressly acknowledges that the PROGRAM contains an embedded automatic reporting system ("PHONE-HOME") which is enabled by default upon download. Unless LICENSEE requests disablement of PHONE-HOME, LICENSEE agrees that BROAD may collect limited information transmitted by PHONE-HOME regarding LICENSEE and its use of the PROGRAM.  Such information shall include LICENSEE’S user identification, version number of the PROGRAM and tools being run, mode of analysis employed, and any error reports generated during run-time.  Collection of such information is used by BROAD solely to monitor usage rates, fulfill reporting requirements to BROAD funding agencies, drive improvements to the PROGRAM, and facilitate adjustments to PROGRAM-related documentation.
* 
* 4. OWNERSHIP OF INTELLECTUAL PROPERTY
* LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies. LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
* Copyright 2012-2016 Broad Institute, Inc.
* Notice of attribution: The GATK3 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
* LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
* 
* 5. INDEMNIFICATION
* LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
* 
* 6. NO REPRESENTATIONS OR WARRANTIES
* THE PROGRAM IS DELIVERED AS IS. BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
* IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
* 
* 7. ASSIGNMENT
* This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
* 
* 8. MISCELLANEOUS
* 8.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
* 8.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
* 8.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
* 8.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested. All notices under this Agreement shall be deemed effective upon receipt.
* 8.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter.
* 8.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
* 8.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.gatk.tools.walkers.simulatereads;

import cern.jet.random.Poisson;
import cern.jet.random.engine.MersenneTwister;
import htsjdk.samtools.SAMFileHeader;
import htsjdk.samtools.SAMProgramRecord;
import htsjdk.samtools.SAMReadGroupRecord;
import org.broadinstitute.gatk.utils.commandline.Argument;
import org.broadinstitute.gatk.utils.commandline.CommandLineProgram;
import org.broadinstitute.gatk.utils.commandline.Output;
import org.broadinstitute.gatk.utils.contexts.AlignmentContext;
import org.broadinstitute.gatk.utils.contexts.ReferenceContext;
import org.broadinstitute.gatk.utils.sam.GATKSAMFileWriter;
import org.broadinstitute.gatk.utils.refdata.RefMetaDataTracker;
import org.broadinstitute.gatk.engine.walkers.RefWalker;
import org.broadinstitute.gatk.engine.walkers.Reference;
import org.broadinstitute.gatk.engine.walkers.Window;
import org.broadinstitute.gatk.utils.QualityUtils;
import org.broadinstitute.gatk.utils.sam.GATKSAMReadGroupRecord;
import org.broadinstitute.gatk.utils.sam.GATKSAMRecord;
import org.broadinstitute.gatk.utils.BaseUtils;
import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;
import org.broadinstitute.gatk.utils.collections.Pair;

import java.util.*;

@Reference(window=@Window(start=-200,stop=200))
public class SimulateReadsForBQSR extends RefWalker<Integer, Integer> {
    @Output(doc="Write output to this BAM filename instead of STDOUT")
    GATKSAMFileWriter out;

    @Argument(fullName="nSamples", shortName="NS", doc="Number of samples to simulate", required=false)
    public int nSamples = 1;

    @Argument(fullName="readDepth", shortName="DP", doc="Read depths to simulate", required=false)
    public int readDepth = 10;

    @Argument(fullName="phredMismatchRate", shortName="MR", doc="Phred-scaled error rate", required=false)
    public int phredMismatchRate = 30;

    @Argument(fullName="GOP", shortName="GOP", doc="Phred-scaled error rate", required=false)
    public int GOP = 30;

    @Argument(fullName="GCP", shortName="GCP", doc="Phred-scaled error rate", required=false)
    public int GCP = 30;

    @Argument(fullName="readLengths", shortName="RL", doc="Read length, in bp", required=false)
    public int readLength = 100;

    @Argument(fullName="badCycle", shortName="badCycle", doc="bad cycle to insert errors", required=false)
    public int badCycle = -1;

    @Argument(fullName="badCycleRate", shortName="badCycleRate", doc="bad cycle error rate", required=false)
    public int badCycleRate = 10;

    @Argument(fullName="badContext", shortName="badContext", doc="bad cycle to insert errors", required=false)
    public String badContext = "";

    @Argument(fullName="badContextRate", shortName="badContextRate", doc="bad cycle error rate", required=false)
    public int badContextRate = 10;


    public enum ReadSamplingMode { CONSTANT, POISSON };
    @Argument(fullName="readSamplingMode", shortName="RSM", doc="Sampling mode", required=false)
    public ReadSamplingMode samplingMode = ReadSamplingMode.CONSTANT;


    private Poisson poissonRandom = null;
    SAMFileHeader header = null;

    private static String SAMPLE_PREFIX = "SAMPLE";
    public static final String PROGRAM_RECORD_NAME = "GATK SimulateReadsForVariants";

    List<String> sampleNames = new ArrayList<String>();
    Map<String, GATKSAMReadGroupRecord> sample2RG = new HashMap<String, GATKSAMReadGroupRecord>();

    private String sampleName(int i) { return sampleNames.get(i); }
    private GATKSAMReadGroupRecord sampleRG(String name) { return sample2RG.get(name); }

    private static final long RANDOM_SEED = 1252863495;
    private static final Random ran = new Random(RANDOM_SEED);

    private GATKSAMReadGroupRecord createRG(String name) {
        GATKSAMReadGroupRecord rg = new GATKSAMReadGroupRecord(name);
        rg.setPlatform("ILLUMINA");
        rg.setSample(name);
        return rg;
    }


    private double errorRate =  QualityUtils.qualToErrorProb((byte) phredMismatchRate);
    public void initialize() {
        // initialize sample I -> sample info map
        List<SAMReadGroupRecord> sampleRGs = new ArrayList<SAMReadGroupRecord>();

        for ( int i = 0; i < nSamples; i++ ) {
            sampleNames.add(String.format("%s%04d", SAMPLE_PREFIX, i));
            GATKSAMReadGroupRecord rg = createRG(sampleName(i));
            sampleRGs.add(rg);
            sample2RG.put(sampleName(i), rg);
        }

        if ( samplingMode == ReadSamplingMode.POISSON )
            poissonRandom = new Poisson(readDepth, new MersenneTwister((int)RANDOM_SEED));

        // initialize BAM headers
        header = new SAMFileHeader();
        header.setSequenceDictionary(getToolkit().getReferenceDataSource().getReference().getSequenceDictionary());
        header.setSortOrder(SAMFileHeader.SortOrder.coordinate);
        header.setReadGroups(sampleRGs);

        final SAMProgramRecord programRecord = new SAMProgramRecord(PROGRAM_RECORD_NAME);
        programRecord.setProgramVersion(CommandLineProgram.getVersionNumber());
        programRecord.setCommandLine(getToolkit().createApproximateCommandLineArgumentString(getToolkit(), this));
        header.setProgramRecords(Arrays.asList(programRecord));

       // out.setMaxRecordsInRam(1000000);
        out.writeHeader(header);


    }

    public Integer map(RefMetaDataTracker tracker, ReferenceContext ref, AlignmentContext context) {
        if ( ref.getLocus().getStart() < readLength || ! BaseUtils.isRegularBase(ref.getBase()) )
            return 0;


        byte[] readBases = getBasesForReads(ref, readLength);
        byte[] readQuals = new byte[readLength];
        Arrays.fill(readQuals, (byte)20);

        int numNewReads = (int)Math.round((double)sampleDepth(samplingMode)/this.readDepth);
        for ( int d = 0; d < numNewReads; d++ ) {
            boolean forward = false; //(d % 2 == 0);
            Pair<String, byte[]> res = addMachineErrors(readBases, errorRate, GOP,GOP,GCP, forward);

            GATKSAMRecord read = new GATKSAMRecord(header);
            read.setBaseQualities(Arrays.copyOf(readQuals,res.second.length));
            read.setReadBases(res.second);
            read.setReadName("FOO");
            read.setCigarString(res.first);
            read.setReadPairedFlag(false);
            read.setAlignmentStart(ref.getLocus().getStart());
            read.setMappingQuality(60);
            read.setReferenceName(ref.getLocus().getContig());
            read.setReadNegativeStrandFlag(forward);
            read.setReadGroup(sampleRG(sampleName(0)));

            out.addAlignment(read);
        }

        return 1;

    }

    private byte[] getBasesForReads(ReferenceContext ref, int readLength) {
        byte[] bases = new byte[readLength];
        System.arraycopy(ref.getForwardBases(), 0, bases, 0, readLength);
        return bases;
    }

    private int sampleDepth(ReadSamplingMode mode) {
        switch ( mode ) {
            case CONSTANT: return readDepth;
            case POISSON: return poissonRandom.nextInt();
            default:
                throw new IllegalStateException("Unexpected DepthSamplingType " + mode);
        }
    }

    /**
     * Routine to add machine artifacts to given read bases
     * @param readBases                 Vector with read bases
     * @param errorRate                 Phred-scale probability of deletion at each position
     * @param insertionQual             Phred-scale probability of deletion at each position
     * @param deletionQual              Phred-scale probability of deletion at each position
     * @param GCP                       Gap continuation penalty
     * @param forward                   If read is in forward/reverse direction
     * @return      CIGAR string of read and new bases
     */
    @Requires({"readBases != null","errorRate>=0","insertionQual > 0","deletionQual > 0","GCP > 0"})
    @Ensures("result != null")
    private Pair<String,byte[]> addMachineErrors(final byte[] readBases, final double errorRate, final int insertionQual,
                                                 final int deletionQual, final int GCP, final boolean forward) {

        double insErrorRate =  QualityUtils.qualToErrorProb((byte) insertionQual);
        double delErrorRate =  QualityUtils.qualToErrorProb((byte) deletionQual);
        double extErrorRate =  QualityUtils.qualToErrorProb((byte) GCP);
        byte[] newReadBases = readBases.clone();

        String cigar = String.format("%dM",readBases.length); // default cigar string
        // insert indel errors. Restrictions:
        // a) at most one indel error per read
        // b) If context == bad context, indel rate determined by input -badContextRate
        for ( int i = 0; i < readBases.length; i++ ) {
            boolean doInsErr = false, doDelErr = false;
            double iRate = insErrorRate, dRate = delErrorRate;
            if (badContext.length() > 0 && i - badContext.length()+1 >= 0) {
                // bad context specified: first check if current read bases == bad context
                // TODO won't work with reverse reads!
                byte[] currentContext = Arrays.copyOfRange(readBases, i - badContext.length()+1, i+1);
                if (Arrays.equals(currentContext, badContext.getBytes())) {
                    iRate =  dRate = QualityUtils.qualToErrorProb((byte) badContextRate);
                  }
            }
            // decide to generate ins/del errors at given rate
            if (ran.nextDouble() < iRate)
               doInsErr = true;
            else if (ran.nextDouble() < dRate)
                doDelErr = true;

            // either ins or del error, but not both, by construction
            if ((doDelErr || doInsErr) && i < readBases.length-3) {
                int indelLength;
                // Now figure out length based on GCP
                final int maxIndelLength = readBases.length - i-3;
                for ( indelLength=1; indelLength < maxIndelLength; indelLength++) {
                    if (ran.nextDouble() > extErrorRate)
                        break;
                }
                if (doDelErr) {
                    // New CIGAR string, and shift bases
                    // This will shorten read, since we don't have bases to span more ref context
                    cigar = String.format("%dM%dD%dM",i+1,indelLength,readBases.length-i-indelLength-1);

                    String s1 = new String(Arrays.copyOfRange(readBases,0,i+1));
                    String s2 = new String(Arrays.copyOfRange(readBases,i+indelLength+1,readBases.length));
                    newReadBases = (s1+ s2).getBytes();
                    break;
                } else if (doInsErr && i-indelLength+1>=0) {
                    cigar = String.format("%dM%dI%dM",i+1,indelLength,readBases.length-i-indelLength-1);
                    // repeat previous context to insert bases since it's the most common error mode (mimic PCR stutter)
                    String s1 = new String(Arrays.copyOfRange(readBases,0,i+1));
                    String basesToInsert = new String(Arrays.copyOfRange(readBases,i-indelLength+1,i+1));
                    String s3 = new String(Arrays.copyOfRange(readBases,i+1,readBases.length-indelLength));
                    newReadBases = (s1+basesToInsert + s3).getBytes();
                    break;
                }
            }
        }

        // now add random mismatch errors
        for ( int i = 0; i < newReadBases.length; i++ ) {
            double errRate = (i== badCycle? badCycleRate: errorRate);
            double r = ran.nextDouble();
            if ( r < errRate ) {
                byte errorBase = BaseUtils.baseIndexToSimpleBase(BaseUtils.getRandomBaseIndex(BaseUtils.simpleBaseToBaseIndex(newReadBases[i])));
                if ( errorBase == newReadBases[i] ) throw new IllegalStateException("Read and error bases are the same");
                newReadBases[i] = errorBase;
            }

            //
        }

        return  new Pair<String, byte[]>(cigar, newReadBases);
    }

    public Integer reduceInit() {
        return 0;
    }

    public Integer reduce(Integer counter, Integer sum) {
        return counter + sum;
    }

    public void onTraversalDone(Integer sum) {
        //variantsWriter.close();
        //out.close();
    }

}