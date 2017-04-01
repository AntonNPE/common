package books.eckel.concurrency.blockingQueueTest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class QWriter implements  Runnable {

    private BlockingQueue<Integer> storage;
    private static AtomicInteger number = new AtomicInteger(0);
    public QWriter(BlockingQueue<Integer> storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (number.get() <  10){
            try {
                TimeUnit.MILLISECONDS.sleep(1);
                storage.put(number.getAndAdd(1));
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }


        }

    }
}
