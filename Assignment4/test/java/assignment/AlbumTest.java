package assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlbumTest {
    @Test
    public void testAlbumCreation() {
        Album album = new Album("Imagine", "https://example.com/album-cover.jpg");
        assertEquals("Imagine", album.getName());
    }
}
