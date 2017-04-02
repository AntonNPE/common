package books.eckel.concurrency.blockingQueueBreadDealer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Toaster implements  Runnable{

    private BlockingQueue<Toast> dryQueue;
    private static int count = 0;
    private Random random = new Random(10);
    public Toaster(BlockingQueue<Toast> dryQueue) {
        this.dryQueue = dryQueue;
    }

    @Override
    public void run() {
        try {
        while (!Thread.interrupted()){



                TimeUnit.MILLISECONDS.sleep(300 + random.nextInt(1000));
                dryQueue.put(new Toast(count));
                System.out.println("Toaster made toast number - " + count++);

            }
        } catch (InterruptedException ex){
                ex.printStackTrace();
            System.out.println("Something wrong with toaster");
            }



    }
}
