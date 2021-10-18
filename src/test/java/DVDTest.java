import org.junit.jupiter.api.Test;
import softwareinstitute.DVD;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DVDTest {
    DVD DVD1 = new DVD("Christopher Nolan", 2021, "Tennet");
    DVD DVD2 = new DVD("James Cameron", 2012, "Avatar", 123);

    @Test
     void testGetName() {
        assertEquals("Tennet", DVD1.getName());
    }
    @Test
    void testGetReleaseYear() {
        assertEquals(2021, DVD1.getReleaseYear());
    }
    @Test
     void testGetDirector() {
        assertEquals("Christopher Nolan", DVD1.getDirector());
    }
    @Test
     void testGetIndex() {
        assertEquals(123, DVD2.getIndex());
    }
    @Test
     void testSetDirector(){
        DVD1.setDirector("Henry");
        assertEquals("Henry",DVD1.getDirector());
    }
    @Test
     void testSetReleaseYear(){
        DVD1.setReleaseYear(1994);
        assertEquals(1994,DVD1.getReleaseYear());
    }
    @Test
     void testSetIndex(){
        DVD1.setIndex(523672);
        assertEquals(523672,DVD1.getIndex());

    }
    @Test
     void testSetName(){
        DVD1.setName("The Grey");
        assertEquals("The Grey",DVD1.getName());
    }
    @Test
     void testDVDConstructor(){
        DVD DVD1 = new DVD("Christopher Nolan", 2021, "Tennet");
        assertEquals(2021,DVD1.getReleaseYear());

    }
}