package books.sierraBeits.ch16.songList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CustomReader {


    public ArrayList<String> getSongList (String path){

        ArrayList<String> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine())!=null){
                            list.add(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }


}
