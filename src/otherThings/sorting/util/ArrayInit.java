package otherThings.sorting.util;

import java.util.Random;

public class ArrayInit {

    private static Random generator = new Random();


    public static  int[] fillArray (ArrayLengthChooser arrayLengthChooser) {
        int[] tempArray = new int[arrayLengthChooser.getArraySize()];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = generator.nextInt(100);
        }
        return tempArray;
    }
}
