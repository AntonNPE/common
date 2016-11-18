package otherThings.searching.controller;

import otherThings.searching.model.binarySearching.BinarySearching;

public class SearchingTest {

    public static void main(String[] args) {

        BinarySearching binarySearching = new BinarySearching(15,100);
        int i = binarySearching.outerBinarySearching();
        System.out.println(i);

    }
}
