import org.junit.jupiter.api.Test;
import softwareinstitute.Comic;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComicTest {


    Comic Comic1 = new Comic("DC", "John Smith", "Superman");

    @Test
    public void testGetName() {
        assertEquals("Superman", Comic1.getName());

    }

    @Test
    public void testGetAuthor() {
        assertEquals("John Smith", Comic1.getAuthor());

    }

    @Test
    public void testGetBrand() {
        assertEquals("DC", Comic1.getBrand());

    }

    @Test
    public void testSetAuthor() {
        Comic1.setAuthor("Steve");
        assertEquals("Steve", Comic1.getAuthor());
    }
    @Test
    public void testSetBrand(){
        Comic1.setBrand("Marvel");
        assertEquals("Marvel",Comic1.getBrand());
    }


}

