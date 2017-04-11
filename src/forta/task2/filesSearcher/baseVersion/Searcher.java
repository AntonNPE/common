package forta.task2.filesSearcher.baseVersion;

import java.io.File;
import java.io.FilenameFilter;

public class Searcher {

    private int count;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void search(String path) {

        search(path,null);

    }

    public void search(String path, FilenameFilter filenameFilter) {

        File file = new File(path);
        File [] listFiles;
        if (filenameFilter==null) {
             listFiles = file.listFiles();
        }else {
            listFiles = file.listFiles(filenameFilter);
        }
        for (int i = 0; i < listFiles.length; i++) {

            if (!listFiles[i].isDirectory()) {
                System.out.println(listFiles[i].getName());
                count++;
            } else {
                search(listFiles[i].getPath());
            }
        }
    }
}
