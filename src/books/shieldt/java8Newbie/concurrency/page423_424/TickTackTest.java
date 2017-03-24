package books.shieldt.java8Newbie.concurrency.page423_424;


import java.util.concurrent.TimeUnit;

public class TickTackTest {

    public static void main(String[] args) {

        Table table = new Table();
        Thread firstThread = new Thread(new Lighter(table));
        Thread secondThread = new Thread(new Batman(table));
        firstThread.start();
        secondThread.start();

    }



}


class Table {

    private boolean state;


    public synchronized void turnOn() {

            try {
                while (state) {
                    this.wait();
                }
                TimeUnit.MILLISECONDS.sleep(300);
                state = true;
                this.notify();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }


    public synchronized void turnOff() {

            try {
                while (!state) {
                    this.wait();
                }
                TimeUnit.MILLISECONDS.sleep(300);
                state = false;
                this.notify();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


    }
}

class Lighter implements  Runnable{

    private Table table;
    private static int counter;
    public Lighter(Table table) {
        this.table = table;
    }

    @Override
    public void run() {

        while (true){
            table.turnOn();
            System.out.println("Lighter made it again - " + counter++);
        }

    }
}

class Batman implements Runnable {

    private Table table;
    private static int counter;
    public Batman(Table table) {
        this.table = table;
    }

    @Override
    public void run() {

        while (true) {
            table.turnOff();
            System.out.println("Batman made it again - " + counter++);
        }

    }
}