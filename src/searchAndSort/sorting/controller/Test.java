package searchAndSort.sorting.controller;

import searchAndSort.sorting.model.quickSorting.QuickSort;
import searchAndSort.sorting.util.concurrency.quickSort.QuickSortConcurrency;
import searchAndSort.sorting.util.printer.ArrayPrint;


public class Test {


    public static void main(String[] args) throws InterruptedException {
        long l1 = System.currentTimeMillis();
        QuickSort quickSort = new QuickSort(100000);
        quickSort.doSort();
//        ArrayPrint.printArray(quickSort.getArray());
//

//        Thread t = new Thread(new QuickSortConcurrency(quickSort,0,quickSort.getArray().length-1));
//        t.start();
//        t.join();
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

    }
}
