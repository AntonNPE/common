package golovach.lecture9.part3.ProducerAndConsumer;


public class Test {

    public static void main(String[] args) {
        Table table = new Table();
        new Thread(new Producer(table, 1000),"First Producer").start();
        new Thread(new Consumer(table, 1000),"First Consumer").start();
    }
}
