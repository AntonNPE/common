package books.eckel.concurrency.serialIdProducer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SerialIdTest  {

    public static void main(String[] args) {

        SerialNumberStorage storage = new SerialNumberStorage(10);
        ExecutorService ex = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 10; i++) {
                ex.execute(new SerialIdChecker(storage));
            }

        }finally {
            ex.shutdown();
        }

    }
}
