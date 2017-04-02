package books.eckel.concurrency.blockingQueueBreadDealer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class TheKingOfButter implements Runnable {

    BlockingQueue<Toast> dryQueue, butteredQueue;
    public TheKingOfButter(BlockingQueue<Toast> dryQueue, BlockingQueue<Toast> butteredQueue) {
        this.dryQueue = dryQueue;
        this.butteredQueue = butteredQueue;
    }

    @Override
    public void run() {
        try{
        while(!Thread.interrupted()){


                Toast toast = dryQueue.take();
                TimeUnit.MILLISECONDS.sleep(100);

                System.out.println("The king of butter made his doing with - " + toast.getId());
                toast.setState(Toast.State.BUTTERED);
                butteredQueue.put(toast);
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
            System.out.println("something wrong with TheKingOfButter");
        }

    }
}
