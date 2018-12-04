import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int counter;
    private ReentrantLock locker = new ReentrantLock();

    public synchronized void incrementSyncMethod(){
        counter++;
    }
    public synchronized void decrementSyncMethod(){
        counter--;
    }

    public void incrementSyncBlock(){
        synchronized(this){
            counter++;
        }
    }
    public void decrementSyncBlock(){
        synchronized(this){
            counter--;
        }
    }

    public void incrementObjectLock(){
        locker.lock();
        try {
            counter++;
        }
        finally {
            locker.unlock();
        }

    }
    public void decrementObjectLock(){
        locker.lock();
        try {
            counter--;
        }
        finally {
            locker.unlock();
        }
    }
}
