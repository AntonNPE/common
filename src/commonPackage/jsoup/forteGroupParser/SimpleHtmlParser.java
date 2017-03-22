package commonPackage.jsoup.forteGroupParser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class SimpleHtmlParser {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        String html = "<html>\n" +
                " <head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>Тег BR</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "\n" +
                "  <p>Р.Л. Стивенсон</p>\n" +
                "  <p><strong>Лето в стране</strong> настало,<br>\n" +
                "   Вереск <strong>опять</strong> цветет.<br>\n" +
                "   Но некому готовить<br>\n" +
                "   Вересковый мед.</p>\n" +
                "\n" +
                " </body>\n" +
                "</html>";
        Document doc = Jsoup.parse(html);
        Elements pElements  = doc.getElementsByTag("p");
        pElements.forEach(element ->{
//            System.out.println(element.html());
            String [] ss = element.html().toString().split("<br>");
            for (int i = 0 ; i < ss.length; i++){
                list.add(ss[i]);
            }
        });
        list.forEach(System.out::println);
    }

    }


