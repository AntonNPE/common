package otherThings.sorting.controller;

import otherThings.sorting.bubbleSorting.BubbleSort;
import otherThings.sorting.printer.ArrayPring;
import otherThings.sorting.quickSorting.QuiskSort;
import otherThings.sorting.util.ArrayInit;
import otherThings.sorting.util.ArrayLengthChooser;

import javax.activation.DataSource;
import java.sql.DataTruncation;
import java.util.Date;


public class SortTest {


    public static void main(String[] args) {
        ArrayLengthChooser arrayLength = new ArrayLengthChooser(50000000);
        int [] array = ArrayInit.fillArray(arrayLength);
        BubbleSort.bubbleSort(array);
        Date date = new Date();
        long f1 =  date.getTime();
        BubbleSort.bubbleSort(array);
        Date date1 = new Date();
        long f2  = date1.getTime();
        System.out.println(f2-f1);

        System.out.println("-----------");

        int [] array1 = ArrayInit.fillArray(arrayLength);
        Date  date2 = new Date();
        f1 = date2.getTime();
        QuiskSort.doSort(array1);
        Date date3 = new Date();
        f2 = date3.getTime();
        System.out.println(f2-f1);

    }


}
