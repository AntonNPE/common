package commonPackage.multithreading.forteTask.accountManagment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService es = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 5; i++) {
                es.execute(new Husband(account));
                es.execute(new Wife(account));
            }
            TimeUnit.SECONDS.sleep(3);
            es.shutdownNow();
            System.out.println("Result balance is - " + account.accountValue());
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
