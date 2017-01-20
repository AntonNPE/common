package commonPackage.collection.customRalization;

import java.util.Random;

public class CustomArrayListTester {


    public static void main(String[] args) {


        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 100; i ++){
            list.add(i,i);
        }
        System.out.println(list.size());

        for (int i = 0; i < 10; i ++ ){

            list.remove(33);

        }
        System.out.println(list.size());
    }


}
