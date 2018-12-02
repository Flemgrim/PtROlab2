public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        //for(int i = 0; i < 10; i++) {
          //  for(int j = 0; j < 6; j++) {
            //    thirdTask(i + 1, 500 + j * 100);
           // }
       // }
    }

    static void firstTask(){
        PrintThread t1 = new PrintThread("+");
        PrintThread t2 = new PrintThread("-");
        t1.start();
        t2.start();


    }
    static void secondTask(){

    }
    static void thirdTask(){

    }
    static void fourthTask(){

    }
}
