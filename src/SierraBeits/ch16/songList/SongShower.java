package SierraBeits.ch16.songList;


import java.util.ArrayList;

public class SongShower {

    String path = "D://songList.txt";
    ArrayList<String> songsList = new ArrayList<>();

    public ArrayList <String> songShower() {
        ArrayList<String> list = new CustomReader().getSongList(path);
        for (int i = 0; i < list.size(); i++) {

            String[] songArray = list.get(i).split("/");
            songsList.add(songArray[0]);
        }
        return songsList;
    }


}
