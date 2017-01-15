package commonPackage.epamTest.swap;

import java.util.PriorityQueue;
import java.util.Random;

public class SwapTest {


    static String  [] queue = new String[16];
//    static Random random = new Random();
    static String [] supArray = {"L","B","T","E"};
    public static void main(String[] args) {
        queue[0] = String.valueOf(14);
        for (int i = 0; i < supArray.length; i++) {

            siftUpComparable(i,supArray[i]);


        }
        for (String st : queue){
            System.out.println(st);
        }

    }

    private static void siftUpComparable(int k, String x) {
        String key = x;
        while (k > 0) {
            int parent = (k - 1) >>> 1;
            String e = queue[parent];
            if (key.compareTo(e) >= 0)
                break;
            queue[k] = e;
            k = parent;
        }
        queue[k] = key;
    }


}
