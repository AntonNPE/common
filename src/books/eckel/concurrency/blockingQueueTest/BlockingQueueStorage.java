package books.eckel.concurrency.blockingQueueTest;

import java.util.concurrent.BlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueStorage  {

    private BlockingQueue<Integer> storage;
    private final static Integer DEFAULT_SIZE = 50;


    public BlockingQueueStorage() {
        storage = new LinkedBlockingQueue<>(DEFAULT_SIZE);
    }

    public BlockingQueueStorage(BlockingQueue<Integer> storage) {
        this.storage = storage;
    }
    public synchronized void add (Integer number){

        try {

            storage.put(number);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    public  Integer retrieve(){
        Integer entity = 0;
        try {
            entity = storage.take();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return entity;
    }
}
