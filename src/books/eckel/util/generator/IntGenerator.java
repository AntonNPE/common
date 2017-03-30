package books.eckel.util.generator;

import java.util.concurrent.locks.ReentrantLock;

public class IntGenerator extends NGenerator {

    private int number;
    ReentrantLock lock = new ReentrantLock();
    @Override
    public  int next() {
        try{
            lock.lock();
            number++;
            number++;
            return number;
        }
        finally {
            lock.unlock();
        }
    }
}
