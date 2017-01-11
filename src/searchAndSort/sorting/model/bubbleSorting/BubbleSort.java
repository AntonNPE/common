package searchAndSort.sorting.model.bubbleSorting;

import searchAndSort.sorting.util.ArrayCreator;

public class BubbleSort {

    private   int ARRAY_LENGTH;
    int [] array;
    public BubbleSort(int ARRAY_LENGTH) {
        this.ARRAY_LENGTH = ARRAY_LENGTH;
        array = ArrayCreator.makeArray(ARRAY_LENGTH);
    }
    public  BubbleSort (int [] array){
        this.array = array;
    }
    public  void bubbleSort(int[] array) {


        for (int i = 0; i < array.length; i++) {

            int min = array[i];

            for (int j = i; j < array.length; j++) {

                if (array[j] < min) {

                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }

            }

        }

    }

}
