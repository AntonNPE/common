package golovach.lecture8.part4.customRabbit;


public class MyRunnable implements Runnable {

    static String spaces;
    static int rabbitsCount;
    public MyRunnable() {
    }
    @Override
    public void run() {
        System.out.println(another(rabbitsCount) + "The another rabbit born" + rabbitsCount);
        Thread thread = Thread.currentThread();
        try {
            thread.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        rabbitsCount++;
        thread1.start();
        rabbitsCount++;
        thread2.start();
    }

    public static String another(int rabbitsCount) {

        String string = "";
        for (int i = 0; i < rabbitsCount; i++) {
            string += " ";
        }
        return string;

    }
}
