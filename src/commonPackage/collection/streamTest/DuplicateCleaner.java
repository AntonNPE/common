package commonPackage.collection.streamTest;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCleaner {

    public static void main(String[] args) {

        listCleaner();

    }


    public static void listCleaner(){
        List<String > commonList = new ArrayList<String>(  Arrays.asList("aaaa","aaaa","bbbb"));
        commonList.add("asdsad");
        System.out.println("original list" + commonList);
        Set<String> tempHashSet = new HashSet<>(commonList);
        commonList = tempHashSet.parallelStream().collect(Collectors.toList());
        System.out.println(commonList);
    }

}
