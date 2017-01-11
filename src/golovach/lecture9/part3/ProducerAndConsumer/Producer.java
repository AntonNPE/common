package golovach.lecture9.part3.ProducerAndConsumer;


public class Producer implements Runnable {

    private final Table table;
    private Integer count = 0;
    private final int sleepTime;

    public Producer(Table table, int sleepTime) {
        this.table = table;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {

            try {

                table.put(count);
                System.out.println("Produce - " + count);
                count++;
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


        }


    }
}
