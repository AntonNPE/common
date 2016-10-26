package golovach.lecture9.part3.ProducerAndConsumer;


public class Table {

    private Integer entity;


    public synchronized void put(Integer entity) throws InterruptedException {

        while (this.entity != null) {
            this.wait();
        }
        this.entity = entity;
        this.notify();

    }


    public synchronized Integer get() throws InterruptedException {

        while (this.entity == null) {
            this.wait();
        }

        int result = this.entity;
        this.entity = null;
        this.notify();
        return result;

    }


}
