PyArrayObject *pyvector(PyObject *objin);
double *pyvector_to_Carray(PyArrayObject *arrayin);
PyArrayObject *pymatrix(PyObject *objin);
double **pymatrix_to_Carray(PyArrayObject *arrayin);
void free_Carrayptrs(double **v);
double **ptrvector(long n);
static PyObject *lg_predict(PyObject *self, PyObject *args);
static PyObject* error_out(PyObject *m);
static int logitPredict_traverse(PyObject *m,visitproc visit, void *arg);
static int logitPredict_clear(PyObject *m);
static PyObject *lg_calcXW(PyObject *self, PyObject *args);