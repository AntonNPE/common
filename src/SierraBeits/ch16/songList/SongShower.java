package SierraBeits.ch16.songList;


import SierraBeits.ch16.songList.entity.Song;

import java.util.ArrayList;

public class SongShower {

    String path = "D://songList.txt";
    ArrayList<Song> songsList = new ArrayList<>();

    public ArrayList <Song> songShower() {
        ArrayList<String> list = new CustomReader().getSongList(path);
        for (int i = 0; i < list.size(); i++) {

            String[] songArray = list.get(i).split("/");
            songsList.add(new Song(songArray[0],songArray[1]));
        }
        return songsList;
    }
}
