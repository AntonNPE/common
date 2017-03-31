package books.eckel.concurrency.serialIdProducer;

public class IdGenerator  {

    private static volatile int number;
    public  static int increaseNumber(){
        return number++;
    }

}
