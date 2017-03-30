package books.eckel.concurrency.evenChecker;

import books.eckel.util.generator.NGenerator;

public class EvenChecker implements Runnable {

    private NGenerator generator;

    public EvenChecker(NGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {

        while (generator.isStop()){
            int number = generator.next();
            if (number%2!=0){
                generator.interrupt();
                System.out.println("Generator was interrupted by - " + Thread.currentThread().getName());
            }else {
                System.out.println("Thread - " + Thread.currentThread().getName() + "worked nice");
            }
        }

    }
}
