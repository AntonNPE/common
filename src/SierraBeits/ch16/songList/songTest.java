package SierraBeits.ch16.songList;


import java.util.ArrayList;
import java.util.Collections;

public class songTest {

    public static void main(String[] args) {
        SongShower  shower = new SongShower();
        ArrayList<String> songList = new ArrayList<>();
        songList = shower.songShower();
        Collections.sort(songList);
        for (String song : songList ) {
            System.out.println(song);
        }
    }
}
