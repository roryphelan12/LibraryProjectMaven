package softwareinstitute;

import java.util.ArrayList;

public class Main {
/////////////////////this is my library////////////////////////////////////////////
    public static void main(String[] args) {
        ArrayList<LibraryItem> Items = new ArrayList<LibraryItem>();
        LibraryItem Comic3 = new Comic("DC","john smith", "Superman");
        LibraryItem DVD3 = new DVD("Christopher Nolan",2021, "Tennet");
        LibraryItem Book3 = new Book("Lord of The Rings",1, "Christopher Tolkien");

        Book Book1 =  new Book("Lord of The Rings",1, "Christopher Tolkien");
        DVD DVD1 = new DVD("Christopher Nolan",2021, "Tennet");
        Comic Comic1 = new Comic("DC","john smith", "Superman");
        Comic Comic2 = new Comic("Spiderman","DC",1234232);


        System.out.println(DVD1.getReleaseYear());
        System.out.println(Comic1.getName());
        System.out.println(Book1.getName());
        System.out.println(Comic1.getBrand());
        System.out.println(DVD1.getDirector());







    }



}

