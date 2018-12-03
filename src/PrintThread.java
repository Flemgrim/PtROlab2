public class PrintThread extends Thread {
    private String symbol;
    private OutputClass shared;
    public PrintThread(String symbol, OutputClass shared) {
        super();
        this.symbol = symbol;
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (shared) {
                while (shared.currentSymbol != symbol) {
                    try {
                        shared.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(symbol);
                switch (symbol) {
                    case "|": shared.currentSymbol = "-"; break;
                    case "-": shared.currentSymbol = "|"; break;

                }
                shared.notifyAll();
            }
        }
    }
}
