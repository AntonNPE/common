package otherThings.sorting.model.quickSorting;

import otherThings.sorting.util.ArrayCreator;

public class QuiskSort {

    private int [] array;
    private int ARRAY_LENGTH;
    public QuiskSort(int[] array) {
        this.array = array;
    }

    public QuiskSort(int ARRAY_LENGTH) {
        this.ARRAY_LENGTH = ARRAY_LENGTH;
        array = ArrayCreator.makeArray(ARRAY_LENGTH);
    }

    public int[] getArray() {
        return array;
    }

    public  void doSort(){
        int startIndex = 0;
        int endIndex = array.length-1;
        quickSort(startIndex,endIndex);

    }

    public  void quickSort(int start, int end ) {
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
