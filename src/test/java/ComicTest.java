import org.junit.jupiter.api.Test;
import softwareinstitute.Comic;
import softwareinstitute.DVD;
import softwareinstitute.LibraryItem;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComicTest {






    @Test
    public  void testGetName() {
        LibraryItem Comic1 = new Comic("DC", "John Smith", "Superman");
        assertEquals("Superman", Comic1.getName());

    }

    @Test
    public void testGetAuthor() {
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        assertEquals("John Smith", Comic1.getAuthor());

    }

    @Test
    public void testGetBrand() {
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        assertEquals("DC", Comic1.getBrand());

    }

    @Test
    public void testSetAuthor() {
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        Comic1.setAuthor("Steve");
        assertEquals("Steve", Comic1.getAuthor());
    }
    @Test
    public void testSetBrand(){
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        Comic1.setBrand("Marvel");
        assertEquals("Marvel",Comic1.getBrand());
    }
    @Test
    public void testSetName(){
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        Comic1.setName("Iron Man");
        assertEquals("Iron Man",Comic1.getName());


}
    @Test
    public  void testSetIndex() {
        Comic Comic2 = new Comic("DC", "John Smith",0 );
        Comic2.setIndex(523672);
        assertEquals(523672, Comic2.getIndex());
    }

    @Test
     public void testComicConstructor(){
        Comic Comic1 = new Comic("DC", "John Smith", "Superman");
        assertEquals("DC",Comic1.getBrand());

    }
}

