package otherThings.sorting.model.insertionSorting;

public class InsertionSorting {

    public static void insertionSorting (int [] array){

        for (int i = 1; i < array.length; i++) {

            for (int j = i; j > 0 && array[j-1]>array[j] ; j--) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }
      }
    }

}
