import org.junit.jupiter.api.Test;
import softwareinstitute.Comic;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComicTest {


    Comic Comic1 = new Comic("DC", "John Smith", "Superman");
    Comic Comic2 = new Comic("DC", "John Smith",0 );


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
    @Test
    public void testSetName(){
        Comic1.setName("Iron Man");
        assertEquals("Iron Man",Comic1.getName());


}
    @Test
    public void testSetIndex() {
        Comic2.setIndex(523672);
        assertEquals(523672, Comic2.getIndex());
    }
}

