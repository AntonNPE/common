package books.sierraBeits.ch15.counter;

public class Test {

    public static void main(String[] args) {

        Unit unit = Unit.getUnit();

        Thread thread = new Thread( new CustomRunable(unit),"First");
        Thread thread1 = new Thread(new CustomRunable(unit),"Second");
        thread.start();
        thread1.start();
    }
}
