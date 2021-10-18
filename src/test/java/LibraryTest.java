import org.junit.jupiter.api.Test;
import softwareinstitute.Comic;
import softwareinstitute.LibraryItem;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testConstructor() {
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        Comic Comic2 = new Comic("DC", "John Smith", 142);
        assertEquals("Superman",Comic1.getName());
    }
    @Test
    public void testGetName() {
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        assertEquals("Superman", Comic1.getName());
    }
    @Test
    public void testGetIndex(){
        Comic Comic2 = new Comic("DC", "John Smith", 142);
        assertEquals(142,Comic2.getIndex());
    }
    @Test
    public void testSetName() {
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        Comic1.setName("new comic");
        assertEquals("new comic", Comic1.getName());
    }
    @Test
    public void testSetIndex(){
        Comic Comic2 = new Comic("DC", "John Smith", 142);
        Comic2.setIndex(666);
        assertEquals(666,Comic2.getIndex());
    }


}
