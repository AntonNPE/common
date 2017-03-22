package books.sierraBeits.ch15.counter;

public class CustomRunable implements Runnable {

    Unit unit;

    public CustomRunable(Unit unit) {
        this.unit = unit;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "going to increment");
            unit.increment();
            System.out.println(unit.getCountAmount());

        }

    }


}
