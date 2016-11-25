package commonPackage.arrayTest;

import searchAndSort.sorting.util.printer.ArrayPrint;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {



    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>(Collections.nCopies(100,9999));
        System.out.println(list.size());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(0,1);
        }
        long result = System.currentTimeMillis() - start;
        System.out.println(result);




//            Arrays.fill(array, 9999);
//            Arrays.fill(array1, 7777);
//            System.arraycopy(array, 0, array1,array1.length-1, 2); // массив автоматически не увеличивается
//            ArrayPrint.printArray(array1);                        //  получаем ArrayIndexOutOfBoundException
//            System.out.println("--------");
//            System.out.println(array1.length);
    }


}
