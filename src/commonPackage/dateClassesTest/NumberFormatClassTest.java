package commonPackage.dateClassesTest;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class NumberFormatClassTest {


    public static void main(String[] args) {

        numberFormatTest();

    }

    public static void numberFormatTest(){

        System.out.println("Number Format AccountTest ");
        NumberFormat format = NumberFormat.getCurrencyInstance();
        System.out.println(format.format(12345.5));

    }

}
