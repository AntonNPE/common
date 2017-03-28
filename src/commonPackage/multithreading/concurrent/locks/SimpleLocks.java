package commonPackage.multithreading.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleLocks {


    public static void main(String[] args) {
        Table table = new Table(0);

        for (int i = 0; i < 2; i++) {
            new Slave(table);
        }

    }




}


class Table {

    private  int counter;
    ReentrantLock lock = new ReentrantLock();
    public  boolean increaseCounter(){
        int startValue=0;
        int endValue = 0;

        try {
        lock.lock();
            startValue = counter;
            TimeUnit.MILLISECONDS.sleep(300);
            endValue = ++counter;
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        finally {
            lock.unlock();
        }

        return endValue - startValue == 1;

    }

    public Table(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }
}

class Slave implements  Runnable {

    Table table;
    Thread thread;

    public Slave(Table table) {
        this.table = table;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public  void run() {
        while  (true) {
                System.out.println(table.increaseCounter());
        }
    }
}


