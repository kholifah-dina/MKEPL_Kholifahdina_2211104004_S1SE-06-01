package assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtistTest {
    @Test
    public void testArtistCreation() {
        Artist artist = new Artist("John Lennon", "The Dreamer", "https://example.com/john-lennon.jpg");
        assertEquals("John Lennon", artist.getName());
        assertEquals("The Dreamer", artist.getAlias());
    }
}
