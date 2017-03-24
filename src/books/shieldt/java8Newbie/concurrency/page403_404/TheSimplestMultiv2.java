package books.shieldt.java8Newbie.concurrency.page403_404;

public class TheSimplestMultiv2 {

    public static void main(String[] args) {

        MyThread thread = new MyThread("Fast Joe");

    }


}


class MyThread implements Runnable {

    private Thread thread;


    public MyThread(String name) {

        thread = new Thread(this,name);
        thread.start();
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " - is alive");

    }
}