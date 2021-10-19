package softwareinstitute;

import java.util.ArrayList;

public abstract class Main implements Borrowable{

    /////////////////////this is my library////////////////////////////////////////////
    public static void main(String[] args) {
LibraryItem libraryitem = new LibraryItem("book", 1273) {


        };


Book book = new Book("hello",3,"hello");
String answer = book.Borrow();
System.out.print(answer);
    }

    }





