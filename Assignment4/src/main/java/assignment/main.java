package assignment;


public class main {
    public static void main(String[] args) {
        // Buat objek Song
        Song song = new Song("Genre", "My Song", "2025", "http://example.com/music.mp3");
        song.setGenre(Genre.POP); // Set genre Pop

        // Buat objek Artist
        Artist artist = new Artist("John Doe", "JD", "http://example.com/john.jpg");
        song.setArtist(artist);

        // Buat objek Album
        Album album = new Album("Best Hits", "http://example.com/album.jpg");
        song.setAlbum(album);

        // Cetak informasi lagu
        song.printInfo(DetailLevel.SONG); // Menampilkan info lagu, artis, dan album
    }
}
