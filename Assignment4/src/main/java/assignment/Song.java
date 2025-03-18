package assignment;

public class Song {
    private String id;
    private String title;
    private String releaseYear;
    private String musicFileURL;
    private Genre genre;
    private Album album;
    private Artist artist;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
        this.genre = Genre.UNDEFINED;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void printInfo(DetailLevel detailLevel) {
        System.out.println("Song title: " + title);
        System.out.println("Release year: " + releaseYear);
        if (genre != Genre.UNDEFINED) {
            System.out.println("Genre: " + genre);
        }

        if (detailLevel == DetailLevel.ARTIST || detailLevel == DetailLevel.FULL) {
            if (artist != null) {
                artist.printInfo();
            }
        }

        if (detailLevel == DetailLevel.ALBUM || detailLevel == DetailLevel.FULL) {
            if (album != null) {
                album.printInfo();
            }
        }
    }
}
