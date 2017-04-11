package forta.task2.filesCounter.v1WithFileCountRange;

import forta.task2.filesCounter.util.validataion.SearchingValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileCountRangeSearcher  {

    private int minCountValue;
    private int maxCountValue;
    private String path;

    public FileCountRangeSearcher(int minCountValue, int maxCountValue, String path) {
        this.minCountValue = minCountValue;
        this.maxCountValue = maxCountValue;
        this.path = path;
    }

    public List<File> searcher(){

        File file = new File(path);
        List<File> resultList = new ArrayList<>();

        try {
            SearchingValidator.pathValidation(file);
            resultList = recSearcher(minCountValue,maxCountValue,file);

        }catch (FileNotFoundException ex){
            //Logger for exception//
        }
        return resultList;
    }

    private List<File> recSearcher(int minCountValue, int maxCountValue, File path){

        List<File> tempList = new ArrayList<>();
        List<File> treeList = Arrays.asList(path.listFiles());
        for (File file : treeList){
            if(file.isDirectory()) {

               if (file.list().length > minCountValue && file.list().length < maxCountValue){

                    tempList.addAll(recSearcher(minCountValue,maxCountValue,file));

               }else if (file.list().length < minCountValue) {
                    long it = minCountValue -  file.list().length;
                   for  (long i = 0; i < it; i++) {
                       File iifile = new File(file.getPath()+"/"+i);
                       iifile.mkdir();
                   }

               }

            }
            else {

                tempList.add(file);

            }
        }
        return tempList;
    }

}
