package books.eckel.concurrency.executors;

import books.eckel.util.simpleMultiThreadSlave.CallableSlave;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

    public static void main(String[] args) throws Exception {

        ExecutorService ex = Executors.newCachedThreadPool();
        List <Future<String>> resultList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            resultList.add(ex.submit(new CallableSlave(i)));
        }

        for (Future<String> ft : resultList){

            System.out.println(ft.get());
        }
    }


}
