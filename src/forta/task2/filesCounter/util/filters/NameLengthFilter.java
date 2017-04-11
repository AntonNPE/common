package forta.task2.filesCounter.util.filters;

import java.io.File;
import java.io.FilenameFilter;

public class NameLengthFilter implements FilenameFilter {

    private int length;

    public NameLengthFilter(int length) {
        this.length = length;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.length()<length;
    }
}

