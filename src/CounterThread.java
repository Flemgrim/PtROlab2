public  class CounterThread extends Thread {
    protected Counter res;
    int targFlag;
    public CounterThread (Counter res, int targFlag){
        this.res = res;
        this.targFlag = targFlag;
    }
    public void run(){
        switch (targFlag){
            case 1 : {
                for (int i = 0; i < 100000; i++) {
                    res.incrementSyncBlock();
                    // res.incrementSyncMethod();
                    // res.incrementObjectLock();
                    //System.out.println(count.counter);
                    break;
                }
            };
            case -1 : {
                for (int i = 0; i < 100000; i++){
                     res.decrementSyncBlock();
                    // res.decrementSyncMethod();
                    //res.decrementObjectLock();
                    //System.out.println(count.counter);
                    break;
                }
            };
        }
    };
}

