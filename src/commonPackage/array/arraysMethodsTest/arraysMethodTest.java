package commonPackage.array.arraysMethodsTest;


import searchAndSort.sorting.util.printer.ArrayPrint;

import java.util.Arrays;
import java.util.Random;

public class arraysMethodTest {

    public static void main(String[] args) {

        int[] firstArray = new int[5];
        int[] secondArray = new int[12];
        int maxSize = firstArray.length < secondArray.length ? secondArray.length : firstArray.length;
        Random random = new Random();
        for (int i = 0; i < maxSize; i++) {
            if ( i < firstArray.length){
                firstArray[i] = random.nextInt(100);
                System.out.println(firstArray[i]);
            }
            if (i < secondArray.length){
                secondArray[i] =  - random.nextInt(100);
                System.out.println(secondArray[i]);
            }
        }
        System.out.println("--------");
        sortArray(secondArray);
        ArrayPrint.printArray(secondArray);

        //заполнение массива случайным числом
//        Arrays.fill(firstArray,random.nextInt(100));  // заполняет массив рандомным числом от 0 до 100
//
//        for (int i = 0; i < firstArray.length; i++) {
//            System.out.println(firstArray[i]);
//        }
//
//
//    }

    }
    public static void makeNewArray (int [] array, int [] array2){

        int sumSize = array.length + array2.length;

        for (int i = 0; i < sumSize; i++) {


        }

    }

    public static void sortArray (int [] array){

        Arrays.sort(array);


    }
    public static void sortArrayFromTo (int [] array, int from, int to){

        Arrays.sort(array,from,to);

    }
    public static int  customBinarySearch (int [] array, int key){

        return Arrays.binarySearch(array,key);


    }


}
