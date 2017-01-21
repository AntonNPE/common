package commonPackage.trashCan;


import java.util.*;
import java.util.stream.Collectors;

public class Trash{

    private int var1;
    private int var2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trash trash = (Trash) o;

        if (var1 != trash.var1) return false;
        return var2 == trash.var2;
    }


    @Override
    public int hashCode() {
        int result = var1;
        result = 31 * result + var2;
        return result;
    }

    public static void main(String[] args) {





        }
    }


