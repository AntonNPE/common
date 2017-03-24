package books.shieldt.java8Newbie.concurrency.page410_411;

import java.util.concurrent.TimeUnit;

public class JoinMethodTest {

    public static void main(String[] args) {
        System.out.println("Start main thread");
        Thread firstThread = new Thread(new SimpleThread(),"First Thread");
        Thread secondThread = new Thread(new SimpleThread(),"Second Thread");
        Thread thirdThread = new Thread(new SimpleThread(),"Third Thread");
        firstThread.start();
        secondThread.start();
        thirdThread.start();
        try {
            firstThread.join();
            secondThread.join();
            thirdThread.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("End main thread");
    }

}

class SimpleThread implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " count is - " + i);
                TimeUnit.MILLISECONDS.sleep(500);
            }catch (InterruptedException ex){
                System.out.println(Thread.currentThread().getName() + "is erupted");
            }
        }


    }
}

