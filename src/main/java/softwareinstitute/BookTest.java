package softwareinstitute;

import org.junit.jupiter.api.Test;

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

    }}

