public class Main {
    public static void main(String[] args) {
        //firstTask();
        secondTask();
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
    static void thirdTask(){

    }
    static void fourthTask(){

    }
}
