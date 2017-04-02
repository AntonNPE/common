package books.eckel.concurrency.blockingQueueBreadDealer;

import java.util.concurrent.*;

public class PromNadzor  {

    public static void main(String[] args) {

        ExecutorService ex = Executors.newCachedThreadPool();
        BlockingQueue<Toast> dryQueue = new LinkedBlockingQueue<>(50);
        BlockingQueue<Toast> butteredQueue = new LinkedBlockingQueue<>(50);
        BlockingQueue<Toast> jammedQueue = new LinkedBlockingQueue<>(50);

        ex.execute(new Toaster(dryQueue));
        ex.execute(new TheKingOfButter(dryQueue,butteredQueue));
        ex.execute(new Jammer(butteredQueue,jammedQueue));
        ex.execute(new Eater(jammedQueue));
        try {
            TimeUnit.MILLISECONDS.sleep(50000);
        }catch (InterruptedException exer){
            exer.printStackTrace();
        }
        ex.shutdownNow();
    }

}
