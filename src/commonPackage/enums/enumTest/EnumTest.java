package commonPackage.enums.enumTest;

import java.util.Arrays;

public class EnumTest  {

    public static void main(String[] args) {

        TempEnum tempEnum = TempEnum.FOURTH;

        TempEnum temp = TempEnum.valueOf("ONE");  // cтроковое представление
        System.out.println(temp);

        System.out.println(Arrays.toString(TempEnum.values())); // вывод всех элементов енама


    }

}
