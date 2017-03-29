package books.eckel.concurrency.daemons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class DaemonsThreadTest {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            ex.execute(()-> new Thread(new SimpleDaemonThread()).setDaemon(true));
        }
        ex.shutdown();
    }


}

class SimpleDaemonThread implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println("this thread is daemon - " + this);
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("Message after sleep");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
class ThreadClass implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}
