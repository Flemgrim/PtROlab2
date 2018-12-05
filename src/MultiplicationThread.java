public class MultiplicationThread extends Thread {
    private Matrix m1;
    private Matrix m2;
    private int threadId;
    private int rawsPerThread;
    private Result res;
    public MultiplicationThread (Matrix m1, Matrix m2, int threadId, int rawsPerThread, Result res){
        this.m1 = m1;
        this.m2 = m2;
        this.threadId = threadId;
        this.rawsPerThread = rawsPerThread;
        this.res = res;
        start();
    }

    public void run() {
        synchronized (res) {
            for (int i = threadId * rawsPerThread; i < (threadId + 1) * rawsPerThread; i++) {
                for (int j = 0; j < m2.getSize(); j++) {
                    for (int k = 0; k < m2.getSize(); k++) {
                        res.result[i][j] += m1.getData()[i][k] * m2.getData()[k][j];
                    }
                }
            }
        }
    }
}
