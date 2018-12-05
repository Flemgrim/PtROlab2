public class Main {
    public static void main(String[] args) {
        //firstTask();
        //secondTask();
        for (int i = 0; i < 5; i++)
            for (int j =0; j < 5; j++)
                thirdTask(100 + i * 100, j + 1);
    }

    static void firstTask(){
        OutputClass sharedRes = new OutputClass("|");
        PrintThread t1 = new PrintThread("|" , sharedRes);
        PrintThread t2 = new PrintThread("-" , sharedRes);
        t1.start();
        t2.start();


    }
    static void secondTask(){
        Counter count = new Counter();

        CounterThread increm = new CounterThread(count, 1);
        CounterThread decrem = new CounterThread(count, -1);

        increm.start();
        decrem.start();

        System.out.print("\n" + count.counter);

    }
    static void thirdTask(int size, int countThreads){
        Matrix m1 = new Matrix(size);
        Matrix m2 = new Matrix(size);
        Result res = new Result(size);
        MultiplicationThread[] multiplicatiomThreads = new MultiplicationThread[size];

        long start = System.currentTimeMillis();
        for (int i = 0; i < countThreads; i++) {
            multiplicatiomThreads[i] = new MultiplicationThread(m1, m2, i, size/countThreads, res);
        }

        for (int i = 0; i < countThreads; i++) {
            try {
                multiplicatiomThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        double duration = (double) (System.currentTimeMillis() - start);
        System.out.println("Threads: " + countThreads + " Size: " + size + " Time: " + duration);

    }
    static void fourthTask(){

    }
}
