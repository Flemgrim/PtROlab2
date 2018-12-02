public class PrintThread extends Thread {
    private String symbol;
    public PrintThread(String symbol) {
        super();
        this.symbol = symbol;
    }

    @Override
    public void run() {
        //try {
            for(int i = 0; i < 100; i++) {
                OutputClass.writeSymbol(symbol);
//                sleep(5);
            }
        //} catch (InterruptedException e) {
          //  e.printStackTrace();
        //}
    }
}
