package commonPackage.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {



    public static void main(String[] args) {

        simpleRegExTest("w4g tr8g9 gtjwbg940j 5tkg34", "[a-h]?");

    }

    public static void simpleRegExTest (String sourceData, String delimiter){

        Pattern pattern = Pattern.compile(delimiter);
        Matcher matcher = pattern.matcher(sourceData);
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }

}
