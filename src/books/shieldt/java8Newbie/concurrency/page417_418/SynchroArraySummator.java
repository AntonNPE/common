package books.shieldt.java8Newbie.concurrency.page417_418;

import java.util.concurrent.TimeUnit;

public class SynchroArraySummator {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7};
        Thread firstThread = new Thread(new MyThread(array),"First");
        Thread secondThread = new Thread(new MyThread(array),"Second");
        firstThread.start();
        secondThread.start();

    }


}

class MyThread implements Runnable {

    private static Victim vc = new Victim();
    private int [] array;

    public MyThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {

            vc.sumArray(array);
        }



}

class Victim {

    int sum;

    public  int sumArray(int[] array){

            sum = 0;

            for (int i = 0; i < array.length; i++) {

                sum += array[i];
                System.out.println("Sum for " + Thread.currentThread().getName() + " equals - " + sum);
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

            }
            return sum;
        }



}

