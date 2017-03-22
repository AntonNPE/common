package books.sierraBeits.ch16.songList.entity;

public class Song implements Comparable <Song> {

    private String artist;
    private String song;

    public Song() {
    }

    public Song(String song, String artist) {
        this.song = song;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public int compareTo(Song o) {
        return o.song.compareTo(this.song);
    }

    @Override
    public String toString() {
        return
                "artist='" + artist + '\'' +
                ", song='" + song + '\'';
    }
}
