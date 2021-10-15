import org.junit.jupiter.api.Test;
import softwareinstitute.DVD;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DVDTest {
    DVD DVD1 = new DVD("Christopher Nolan",2021, "Tennet");
    DVD DVD2 = new DVD("James Cameron", 2012,"Avatar");

    @Test
    public void testGetName() {
        assertEquals("Tennet",DVD1.getName());

    }

    @Test
    public void testGetReleaseYear() {
        assertEquals(2021,DVD1.getReleaseYear());

    }

    @Test
    public void testGetDirector() {
        assertEquals("Christopher Nolan", DVD1.getDirector());


    }}
