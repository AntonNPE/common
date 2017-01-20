package commonPackage.simpleTasks;

import java.util.ArrayList;

public class DecimalToBinaryConverter {


    public static void main(String[] args) {

        converter(17);

    }


    public static void converter(int number) {


        ArrayList<Integer> list = new ArrayList<>();
        while (number > 0) {
        list.add(0,number%2);
            number/=2;
        }
        list.forEach(System.out::print);
    }
}
