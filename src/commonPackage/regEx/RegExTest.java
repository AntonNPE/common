package commonPackage.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {



    public static void main(String[] args) {

        simpleRegExTest(args[0],args[1]);
//        System.out.println("Hello!");
    }

    public static void simpleRegExTest (String sourceData, String delimiter){

        Pattern pattern = Pattern.compile(delimiter);
        Matcher matcher = pattern.matcher(sourceData);
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

}
