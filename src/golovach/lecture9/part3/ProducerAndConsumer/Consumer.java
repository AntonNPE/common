package golovach.lecture9.part3.ProducerAndConsumer;



public class Consumer implements Runnable {

    private final Table table;
    private final int sleepTIme;

    public Consumer(Table table, int sleepTIme) {
        this.table = table;
        this.sleepTIme = sleepTIme;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100000; i++) {

            try {
                int  result = table.get();
                System.out.println("Consumed - " + result);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }


    }
}
