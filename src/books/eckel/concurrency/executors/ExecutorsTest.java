package books.eckel.concurrency.executors;

import books.eckel.util.simpleMultiThreadSlave.RunnableSlave;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest  {

    public static void main(String[] args) {

        ExecutorService ex = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++) {
            ex.execute(new RunnableSlave());
        }
        ex.shutdown();
    }

}
