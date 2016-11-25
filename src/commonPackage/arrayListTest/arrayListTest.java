package commonPackage.arrayListTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayListTest {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Collections.nCopies(10,11));
        Integer array[] = new Integer[15];
        Arrays.fill(array,5);

        Integer [] array2 = list.toArray(array);
        for (Integer anArray2 : array2) {
            System.out.println(anArray2);
        }




    }




}
