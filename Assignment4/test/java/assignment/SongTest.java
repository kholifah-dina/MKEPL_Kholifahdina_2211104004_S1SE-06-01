package assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SongTest {
    @Test
    public void testSongCreation() {
        Song song = new Song("1", "Imagine", "1971", "https://example.com/imagine.mp3");
        assertEquals("Imagine", song.getTitle());
        assertEquals("1971", song.getReleaseYear());
    }

    @Test
    public void testSetGenre() {
        Song song = new Song("1", "Imagine", "1971", "https://example.com/imagine.mp3");
        song.setGenre(Genre.ROCK);
        assertEquals(Genre.ROCK, song.getGenre());
    }
}
