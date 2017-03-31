package books.eckel.concurrency.differentLocks;

public class DifLockSlave {

    private final Object object = new Object();

    public synchronized void defaultLock() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Default Lock");
            Thread.yield();
        }
    }

    public void internalLock() {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Internal lock");
                Thread.yield();
            }
        }
    }

}
