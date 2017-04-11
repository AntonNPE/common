package forta.task2.filesCounter.baseVersion;

import forta.task2.filesCounter.util.filters.NameLengthFilter;

public class SearcherTest {


    public static void main(String[] args) {
        Searcher searcher = new Searcher();
        searcher.search("D:/l",new NameLengthFilter(6));
        System.out.println(searcher.getCount());



//        File file = new File("C://");
//        String [] list = file.list();
//        System.out.println(list.length);
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }
    }
}