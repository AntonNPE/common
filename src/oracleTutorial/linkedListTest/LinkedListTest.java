package oracleTutorial.linkedListTest;

import java.util.HashMap;
import java.util.LinkedList;

public class LinkedListTest {

    NestedClass nestedClass;

    public void testNested(){
        NestedClass someNested = nestedClass;
    }

    public static void main(String[] args) {


//        Integer i = 5000;
//         i.hashCode();
//        int t = 1000000;
//        System.out.println(t/4096);
//        System.out.println((51&15)==(101603&15));
//        System.out.println(51&15);
            HashMap<String,String> map = new HashMap<>();

    }

    public static boolean test(){

        for (int i = 0; i < 10; i++) {

            if (i == 5){
                System.out.println("---------->"+i);
                return true;
            }
            System.out.println(i);
        }
        return false;
    }

     static class NestedClass{

        String name;
        int age;
        boolean sex;

        public NestedClass(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }


}
