package books.shieldt.concurrency.page401_402;

import java.util.concurrent.TimeUnit;

public class TheSimplestMulti  {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread,"First Thread");
        thread.start();

    }

}


class MyThread implements Runnable {

    public MyThread() {
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +  " - was started");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Sleep time - " + i);
                TimeUnit.MILLISECONDS.sleep(300);
            }
            System.out.println(Thread.currentThread().getName() + " - is over"); // имя потока задаётся в конструкторе Thread
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}