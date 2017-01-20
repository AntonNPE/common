package commonPackage.collection.customRealization;

import java.util.Arrays;

public class CustomArrayList {

    private static final int DEFAULT_ARRAY_CAPACITY = 10;
    private Object [] coreArray;
    private int actualSize;

    public CustomArrayList() {
        coreArray = new Object[DEFAULT_ARRAY_CAPACITY];

    }

    public CustomArrayList(int usersCapacity){
        coreArray = new Object[usersCapacity];
    }

    public void add(Object element, int index){
        rangeChecker(index);
        if (coreArray.length - actualSize < 5) {
            grow();
        }
        arrayInserter(index,element);
        actualSize++;
    }

    public void remove (int index){
        rangeChecker(index);
        System.arraycopy(coreArray,index+1,coreArray,index,actualSize-index-1);
        coreArray [actualSize--] = null ;
    }

    private void grow(){
        System.out.println("The array grew" + coreArray.length+ " - " + actualSize);
        coreArray = Arrays.copyOf(coreArray,coreArray.length+(coreArray.length>>1));
    }

    private void arrayInserter (int index, Object element){
        System.arraycopy(coreArray,index,coreArray,index+1,actualSize-index);
        set(element,index);
    }

    public Object set(Object element,int index){
        rangeChecker(index);
        Object oldElement = coreArray[index];
        coreArray[index] = element;
        return oldElement;
    }

    private void rangeChecker(int index){

        if(index > actualSize || index < 0){
            throw  new IllegalArgumentException();
        }
    }
    public int size (){
        return actualSize;
    }

}
