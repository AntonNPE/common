package commonPackage.dateClassesTest;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest {



    public static void main(String[] args) {

        firstCalendarTest();

    }

    public static void firstCalendarTest(){

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        Locale by = new Locale("be");
        DateFormat byFormat = DateFormat.getDateInstance(DateFormat.FULL,by);
        Date date = cal.getTime();
        System.out.println(byFormat.format(date));

    }



}
