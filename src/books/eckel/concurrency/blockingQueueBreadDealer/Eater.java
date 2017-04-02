package books.eckel.concurrency.blockingQueueBreadDealer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Eater implements Runnable {

    private BlockingQueue<Toast> jammedQueue;
    private static int count;

    public Eater(BlockingQueue<Toast> jammedQueue) {
        this.jammedQueue = jammedQueue;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                Toast toast = jammedQueue.take();
                TimeUnit.MILLISECONDS.sleep(100);
                if (toast.getId() != count++ || toast.getState()!= Toast.State.JAMMED) {
                    System.out.println("Something was wrong");
                    System.exit(1);
                } else {
                    System.out.println("Eater ate - " + toast.getId());
                }
            }

        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("something was wrong with eater");
        }

    }
}
