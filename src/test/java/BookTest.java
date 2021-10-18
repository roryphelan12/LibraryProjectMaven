import org.junit.jupiter.api.Test;
import softwareinstitute.Book;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    Book Book1 =  new Book("Lord of The Rings",1, "Christopher Tolkien");

    @Test
   public void testGetName() {
      assertEquals("Lord of The Rings",Book1.getName());

    }

    @Test
    public void testGetAuthor() {
        assertEquals("Christopher Tolkien",Book1.getAuthor());

    }

    @Test
    public void testGetEdition() {
        assertEquals(1, Book1.getEdition());

    }
    @Test
    public void testSetEdition(){
        Book1.setEdition(5);
        assertEquals(5,Book1.getEdition());

    }
    @Test
    public void testSetName() {
        Book1.setName("Two Towers");
        assertEquals("Two Towers", Book1.getName());
    }
    @Test
    public void testSetAuthor() {
        Book1.setAuthor("Dickens");
        assertEquals("Dickens", Book1.getAuthor());
    }
}

