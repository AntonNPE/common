package otherThings.searching.model.binarySearching;

import otherThings.sorting.model.quickSorting.QuiskSort;
import otherThings.sorting.util.ArrayCreator;

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

        int lowest = 0;
        int highest = array.length-1;
        QuiskSort quiskSort = new QuiskSort(array);
        quiskSort.doSort();
        return innerBinarySearching(lowest, highest);

    }

    private int innerBinarySearching(int lowest, int highest) {

        int mid = lowest + (highest - lowest) / 2;
        if (lowest == highest && key !=array[mid]){

            return -11111111;
        }
        if (key < array[mid]) {
            return innerBinarySearching(lowest, mid - 1);
        } else if (key > array[mid]) {
            return innerBinarySearching(mid + 1, highest);
        }  return mid;
    }


}
