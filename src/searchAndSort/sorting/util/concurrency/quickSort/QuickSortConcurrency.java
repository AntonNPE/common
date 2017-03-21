package searchAndSort.sorting.util.concurrency.quickSort;

import searchAndSort.sorting.model.quickSorting.QuickSort;

public class QuickSortConcurrency implements Runnable {

    private QuickSort quickSort;
    private int startPosition;
    private int endPosition;

    public QuickSortConcurrency() {
    }

    public QuickSortConcurrency(QuickSort quickSort, int startPosition, int endPosition) {
        this.quickSort = quickSort;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    @Override
    public void run(){

        int [] array = quickSort.getArray();
        if (startPosition>=endPosition){
            return;
        }

        int sp = startPosition;
        int ep = endPosition;
        int b = sp - (sp - ep)/2;
        while (sp < ep){

            while ((array[sp]<=array[b]) && (sp < b)){
                sp++;
            }
            while (array[ep]>=array[b] && (ep > b)){
                ep--;
            }

            if (sp<ep) {

                int temp = array[sp];
                array[sp] = array[ep];
                array[ep] = temp;
                if (sp == b) b = ep;
                else if (ep == b) b = sp;
            }

        }
        try {
            Thread t = new Thread(new QuickSortConcurrency(quickSort, startPosition, b));
            t.start();
            t.join();
            Thread t2 = new Thread(new QuickSortConcurrency(quickSort, b + 1, endPosition));
            t2.start();
            t2.join();
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}
