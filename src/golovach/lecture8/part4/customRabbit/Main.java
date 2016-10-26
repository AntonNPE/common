package golovach.lecture8.part4.customRabbit;


public class Main {

    public static void main(String[] args) throws InterruptedException {




            Thread thread = new Thread(new MyRunnable());
            thread.start();



    }

}
