package books.eckel.util.simpleMultiThreadSlave;

import java.util.concurrent.Callable;

public class CallableSlave implements Callable <String > {

    private int id;

    public CallableSlave(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "This thread has id number - " + id;
    }
}
