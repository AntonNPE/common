package otherThings.sorting.bubbleSorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {


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

        return array;
    }

}
