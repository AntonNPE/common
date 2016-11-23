package sierraBeits.ch9.fiveMinutesStory;

import java.util.ArrayList;


public class Parent {

    public Parent(ArrayList list) {

        for (int i = 0; i < 5; i++) {
            list.add("Hi");
            System.out.println( "Parent constructor" + list.size());
        }

            }
}
