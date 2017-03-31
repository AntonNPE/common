package books.eckel.concurrency.differentLocks;

public class InternalLockRunnable implements Runnable {

    private DifLockSlave difLockSlave;

    public InternalLockRunnable(DifLockSlave difLockSlave) {
        this.difLockSlave = difLockSlave;
    }

    @Override
    public void run() {

        difLockSlave.internalLock();

    }

}
