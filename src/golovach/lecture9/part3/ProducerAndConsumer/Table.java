package golovach.lecture9.part3.ProducerAndConsumer;


public class Table {

    private static boolean entity;
    private static int entityCounter;
    public synchronized void put() throws InterruptedException {
        while (entity) {
            this.wait();
        }
        entity = true;
        this.notify();
        entityCounter++;
    }

    public synchronized void get() throws InterruptedException {
        while (!entity) {
            this.wait();
        }
        entity = false;
        this.notify();
    }

    public int getCount (){
        return entityCounter;
    }
}
