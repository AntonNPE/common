package golovach.lecture9.part1.exploration;


import java.util.ArrayList;
import java.util.List;

public class Test {

    private final static List<String> list = new ArrayList<>();
    static List<String> anotherList = list;

    public static void main(String[] args) {
        System.out.println(list);
        System.out.println("--------------");
        anotherList.add("sopa");
        System.out.println("--------------");
        System.out.println(list);
        System.out.println("--------------");
        System.out.println(anotherList);


    }


}
