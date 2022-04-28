import java.io.Serializable;

public class Album implements Serializable {
    private String artist;
    private String name;
    private int releaseDate;
    private long sales;
    private String genre;

    public Album(){}

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public long getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
