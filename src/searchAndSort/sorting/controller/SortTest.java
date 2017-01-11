package searchAndSort.sorting.controller;

import searchAndSort.sorting.model.quickSorting.QuiskSort;


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
