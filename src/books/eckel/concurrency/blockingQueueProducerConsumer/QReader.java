package books.eckel.concurrency.blockingQueueProducerConsumer;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class QReader implements Runnable {

    private final BlockingQueue <Integer> storage;
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

            while (storage.size()>0){

                list.add(storage.take());

            }

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }


    }
}
