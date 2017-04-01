package books.eckel.concurrency.blockingQueueTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class BQTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        BlockingQueue<Integer> bq = new LinkedBlockingQueue<>(50);
        ExecutorService exer = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            exer.execute(new QReader(bq,list));
            exer.execute(new QWriter(bq));
        }
        exer.shutdown();
        list.forEach((p)->{
            try{
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print( p + ",");
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        });
    }
}
