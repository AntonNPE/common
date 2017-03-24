package books.shieldt.java8Newbie.concurrency.page405_406;

public class Exercise11_1 {

    public static void main(String[] args) {

        MyThread thread  = new MyThread("Fast Andy");


    }

}

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        this.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - is alive");
    }
}