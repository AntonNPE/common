package books.eckel.concurrency.differentLocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockSectionTest {


    public static void main(String[] args) {
        DifLockSlave difLockSlave = new DifLockSlave();
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new InternalLockRunnable(difLockSlave));
        ex.execute(new DefaultLockRunnable(difLockSlave));
        ex.shutdown();

    }

}
