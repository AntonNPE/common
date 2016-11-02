package otherThings.sorting;

import java.util.Random;

public class QuiskSort {

    private final static int ARRAY_LENGHT = 10;
    private static int[] array = new int[ARRAY_LENGHT];
    private static Random generator = new Random();

    public static void arrayInit (){

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
        }
    }
    public static void  arrayPrint(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void doSort(){
        int startIndex = 0;
        int endIndex = ARRAY_LENGHT-1;
        quickSort(startIndex,endIndex);
    }

    public static void quickSort(int start, int end) {
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
                quickSort(start,m);
                quickSort(m+1,end);

            }

        }
    }

    public static void main(String[] args) {

        arrayInit();
        arrayPrint();
        doSort();
        System.out.println("--------------");
        arrayPrint();

    }


}
