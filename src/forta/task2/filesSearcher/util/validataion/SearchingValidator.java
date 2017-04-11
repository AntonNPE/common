package forta.task2.filesSearcher.util.validataion;

import java.io.File;
import java.io.FileNotFoundException;

//The class which uses for validation  path //
public class SearchingValidator {

    private File sourcePath;

    public SearchingValidator(File sourcePath) {
        this.sourcePath = sourcePath;
    }

    public static void pathValidation (File file) throws FileNotFoundException{

        if (file==null){
            throw new FileNotFoundException(/*Message*/);
        } else if (!file.isDirectory()){
            throw new FileNotFoundException(/*Message*/);
        }
    }
}
