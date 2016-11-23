package searchAndSort.sorting.util;

import java.util.Random;

public class ArrayCreator {


    public static int[] makeArray (int ARRAY_LENGTH){

        int array [] = new int[ARRAY_LENGTH];
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
        }
        return array;
    }
}
