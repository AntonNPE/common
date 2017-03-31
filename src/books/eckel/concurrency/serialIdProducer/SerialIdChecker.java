package books.eckel.concurrency.serialIdProducer;

public class SerialIdChecker implements Runnable {


    private SerialNumberStorage storage;

    public SerialIdChecker(SerialNumberStorage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            int number = IdGenerator.increaseNumber();
            if (storage.isConsist(number)) {
                System.out.print("Duplicate detected " + number);
                System.exit(0);
            }
            storage.add(number);
        }
    }
}
