package books.eckel.concurrency.blockingQueueTest;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class QReader implements Runnable {

    private BlockingQueue <Integer> storage;
    private static Integer readCount;
    private List<Integer> list;

    public QReader(BlockingQueue <Integer> storage, List<Integer> list) {
        this.storage = storage;
        this.list = list;
    }

    public QReader(BlockingQueue <Integer> storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        try {

            while (true){
                TimeUnit.MILLISECONDS.sleep(1);
                list.add(storage.take());

            }

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }


    }
}
