package sierraBeits.ch16.genericsExp;

import java.util.ArrayList;
import java.util.List;

public class genericsTest {

    class A {

        public String name = "This is A class";

        public void shout() {
            System.out.println("class A in action");
        }
    }

    class B extends A {
        String name = "This is B class";
        public void shout(){
            System.out.println("class B in action");
        }
    }

    ArrayList <A> listA = new ArrayList<>();
    ArrayList<B> listB = new ArrayList<>();

    ArrayList<Object> list = new ArrayList<>();
    List <Object> aList = list;
    public  void method (ArrayList < ? extends A> list){

    }


}
