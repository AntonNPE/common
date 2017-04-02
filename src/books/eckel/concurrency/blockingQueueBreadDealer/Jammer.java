package books.eckel.concurrency.blockingQueueBreadDealer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Jammer implements Runnable{

    private static int count;

    private BlockingQueue<Toast> butteredQueue, jammedQueue;

    public Jammer(BlockingQueue<Toast> butteredQueue, BlockingQueue<Toast> jammedQueue) {
        this.butteredQueue = butteredQueue;
        this.jammedQueue = jammedQueue;
    }

    @Override
    public void run() {
        try {
        while (!Thread.interrupted()){

                Toast toast = butteredQueue.take();
                TimeUnit.MILLISECONDS.sleep(100);
                    System.out.println("Jammer  is done with - " + toast.getId());
                    toast.setState(Toast.State.JAMMED);
                    jammedQueue.put(toast);

            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
            System.out.println("Something wrong with jammer");
        }
    }
}
