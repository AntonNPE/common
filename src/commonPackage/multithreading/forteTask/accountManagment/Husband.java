package commonPackage.multithreading.forteTask.accountManagment;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Husband implements Runnable {

    private Account account;
    private Random random = new Random();

    public Husband(Account account) {
        this.account = account;
    }

    @Override
    public void run() {

        try {
        while (!Thread.interrupted()){
                TimeUnit.MILLISECONDS.sleep(300);
                account.put(random.nextInt(1000));
            }
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
