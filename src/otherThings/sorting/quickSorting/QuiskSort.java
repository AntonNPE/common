package otherThings.sorting.quickSorting;

import java.util.Random;

public class QuiskSort {

    static int [] array;

    public static void doSort(int [] extArray){
        int startIndex = 0;
        int endIndex = extArray.length-1;
        array = extArray;
        quickSort(startIndex,endIndex);

    }

    public static void quickSort(int start, int end ) {
        if (start >= end) {
            return;
        }

        int s = start, e = end;
        int m = s - (s - e) / 2;

        while (s < e) {

            while (s < m && (array[s] <= array[m])) {
                s++;
            }
            while (e > m && (array[m] <= array[e])) {
                e--;
            }

            if (s < e) {
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;

                if (s == m) {
                    m = e;
                } else if (e == m) {
                    m = s;
                }

            }

        }
        quickSort(start,m);
        quickSort(m+1,end);

    }


}
