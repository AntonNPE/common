package searchAndSort.searching.controller;

import searchAndSort.searching.model.binarySearching.BinarySearching;

public class SearchingTest {

    public static void main(String[] args) {

        BinarySearching binarySearching = new BinarySearching(5,100);
        int i = binarySearching.outerBinarySearching();
        System.out.println(i);

    }
}
