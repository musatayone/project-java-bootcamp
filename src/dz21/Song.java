package dz21;

public class Song {
    private String title;
    private String artist;
    private String genre;
    private String lyrics;

    public Song() {
    }

    public Song(String title, String artist, String genre, String lyrics) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public String toString() {
        return title + "\n"
                + artist + "\n"
                + genre + "\n"
                + lyrics;
    }
}
