package books.sierraBeits.ch16.songList;


import books.sierraBeits.ch16.songList.entity.Song;

import java.util.ArrayList;
import java.util.Collections;

public class SongTest {

    public static void main(String[] args) {
        SongShower  shower = new SongShower();
        ArrayList<Song> songList = new ArrayList<>();
        songList = shower.songShower();
        Collections.sort(songList);
        for (Song song : songList ) {
            System.out.println(song);
        }
    }
}
