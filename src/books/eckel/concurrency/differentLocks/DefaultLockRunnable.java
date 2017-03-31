package books.eckel.concurrency.differentLocks;

public class DefaultLockRunnable implements Runnable {

     private DifLockSlave difLockSlave;

    public DefaultLockRunnable(DifLockSlave difLockSlave) {
        this.difLockSlave = difLockSlave;
    }

    @Override
    public void run() {

        difLockSlave.defaultLock();

    }
}
