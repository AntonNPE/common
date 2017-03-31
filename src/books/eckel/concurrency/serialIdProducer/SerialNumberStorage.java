package books.eckel.concurrency.serialIdProducer;

import java.util.Arrays;

public class SerialNumberStorage {

    private int length;
    private int[] array;
    private int index;

    public SerialNumberStorage(int length) {
        this.length = length;
        array = new int[length];
        Arrays.fill(array, -1);
    }

    public synchronized void add(int number) {
        array[index] = number;
        index = ++index % length;
    }

    public synchronized boolean isConsist(int number) {


        for (int i = 0; i < length; i++) {
            if (array[i] == number) {
                return true;

            }

        }
        return false;
    }

}

