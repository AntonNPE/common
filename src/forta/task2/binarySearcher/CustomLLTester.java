package forta.task2.binarySearcher;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class CustomLLTester {

    public static void main(String[] args) {


        CustomLinkedList linkedList = new CustomLinkedList();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getSize());

    }

}
