package forta.task2.filesCounter.v1WithFileCountRange;

import java.io.File;
import java.util.List;

public class FileCountRangeTester  {
/*Test for FileCountRangeSearcher. This class has methods for counting all  files which are not a directory.
  Also this class contains method which create a different value of directories.*/
    public static void main(String[] args) {
        String path = "D://l";
        int minAmount = 3;
        int maxAmount = 9;
        FileCountRangeSearcher searcher = new FileCountRangeSearcher(minAmount,maxAmount,path);
        List <File> filesList = searcher.searcher();
        for (File file : filesList) {
            System.out.println(file);
        }

    }


}
