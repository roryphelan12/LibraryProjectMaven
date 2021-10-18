import org.junit.jupiter.api.Test;
import softwareinstitute.Comic;
import softwareinstitute.LibraryItem;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {
    Comic Comic1 = new Comic("DC","John Smith", "Superman");
    Comic Comic2 = new Comic("DC","John Smith", 142);

    @Test
    public void testGetName() {
        assertEquals("Superman", Comic1.getName());
    }
    @Test
    public void testGetIndex(){
        assertEquals(142,Comic2.getIndex());
    }


}
