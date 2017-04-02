package books.eckel.concurrency.blockingQueueProducerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class QWriter implements  Runnable {

    private final BlockingQueue<Integer> storage;
    private final static AtomicInteger number = new AtomicInteger(0);
    public QWriter(BlockingQueue<Integer> storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (number.get() <  10){
            try {
                storage.put(number.getAndIncrement());
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
