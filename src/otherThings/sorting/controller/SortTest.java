package otherThings.sorting.controller;

import otherThings.sorting.model.bubbleSorting.BubbleSort;
import otherThings.sorting.model.insertionSorting.InsertionSorting;
import otherThings.sorting.model.quickSorting.QuiskSort;
import otherThings.sorting.util.ArrayInit;
import otherThings.sorting.util.ArrayLengthChooser;

import java.util.Date;


public class SortTest {


    public static void main(String[] args) {

        QuiskSort quiskSort = new QuiskSort(100);
        quiskSort.doSort();
        int [] array = quiskSort.getArray();
        for (int i :
                array) {
            System.out.println(i);
        }

    }


}
