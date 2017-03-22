package books.javaMethodProgramming.chapter13.htmlReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlReader {

    public static void main(String[] args) {


        URL utd = null;
        String urlName = "http://manutd.ru";
        try {

            utd = new URL(urlName);


        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(utd.openStream()))){

            String line = "";
            while ((line = reader.readLine())!= null){
                System.out.println(line);
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

}
