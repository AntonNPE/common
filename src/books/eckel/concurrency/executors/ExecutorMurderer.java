package books.eckel.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecutorMurderer  {

    public static void main(String[] args) {
        try{
            ExecutorService ex = Executors.newCachedThreadPool(new SomeThreadFactory());
            ex.execute(new Murderer());

        } catch (RuntimeException ex){
            ex.printStackTrace();
        }


    }


}
class Murderer implements Runnable {



    @Override
    public void run() {

        throw new RuntimeException();
    }
}

class SomeThreadFactory implements ThreadFactory {


    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("Oliver");
        thread.setUncaughtExceptionHandler((p,t)-> System.out.println("thread " + p + " produced " + t));

        return  thread ;
    }
}