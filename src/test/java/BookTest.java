import org.junit.jupiter.api.Test;
import softwareinstitute.Book;
import softwareinstitute.Comic;
import softwareinstitute.LibraryItem;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest{


    @Test
    public void testGetName() {
        LibraryItem Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        assertEquals("Lord of The Rings", Book1.getName());

    }

    @Test
    public void testGetAuthor() {
        Book Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        assertEquals("Christopher Tolkien", Book1.getAuthor());

    }

    @Test
    public void testGetEdition() {
        Book Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        assertEquals(1, Book1.getEdition());

    }

    @Test
    public void testSetEdition() {
        Book Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        Book1.setEdition(5);
        assertEquals(5, Book1.getEdition());

    }

    @Test
    public void testSetName() {
        LibraryItem Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        Book1.setName("Two Towers");
        assertEquals("Two Towers", Book1.getName());
    }

    @Test
    public void testSetAuthor() {
        Book Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        Book1.setAuthor("Dickens");
        assertEquals("Dickens", Book1.getAuthor());
    }

    @Test
    public void testGetIndex() {
        LibraryItem Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        Book book = new Book(422, 2, "lord of the flies");
        assertEquals(422, book.getIndex());
    }

    @Test
    public void testSetIndex() {
        LibraryItem Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        Book book = new Book(422, 2, "lord of the flies");
        book.setIndex(3);
        assertEquals(3, book.getIndex());
    }

    @Test
    public void testConstructorBook() {
        Book Book1 = new Book("Lord of The Rings", 1, "Christopher Tolkien");
        assertEquals(1, Book1.getEdition());
    }
}

