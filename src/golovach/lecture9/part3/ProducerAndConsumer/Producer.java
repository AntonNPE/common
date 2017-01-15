package golovach.lecture9.part3.ProducerAndConsumer;


public class Producer implements Runnable {
    private final Table table;

    private final int sleepTime;

    public Producer(Table table, int sleepTime) {
        this.table = table;
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            try {
                table.put();
                System.out.println(Thread.currentThread().getName()+" - "+table.getCount());
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
