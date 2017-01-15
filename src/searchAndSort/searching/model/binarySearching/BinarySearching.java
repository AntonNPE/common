package searchAndSort.searching.model.binarySearching;

import searchAndSort.sorting.model.quickSorting.QuiskSort;
import searchAndSort.sorting.util.ArrayCreator;

public class BinarySearching {


    private int key;
    private int arrayLength;
    int[] array;

    public BinarySearching(int key, int arrayLength) {
        this.arrayLength = arrayLength;
        array = ArrayCreator.makeArray(arrayLength);
        this.key = key;
    }

    public void setKey(int key) {
        this.key = key;
    }


    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public int outerBinarySearching() {


        QuiskSort quiskSort = new QuiskSort(array);
        quiskSort.doSort();
        return innerBinarySearching();

    }

    private int innerBinarySearching() {

        int lowest = 0;
        int highest = arrayLength - 1;
        while (lowest <= highest) {
            int mid = (lowest + highest) >>> 1;
            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) {
                highest = mid-1;
            } else if (key > array[mid ]) {
                lowest =mid+1;
            }

        }
        return -111111;

    }
}
