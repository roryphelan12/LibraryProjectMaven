package softwareinstitute;

public class Book extends LibraryItem implements Borrowable{



    ///////////////////////////Attributes//////////////////////////////////

    private String author;
    private int edition;

    ///////////////////////////Constructors//////////////////////////////////



    public Book(String title, int edition, String author) {
        super(title);
        this.author = author;
        this.edition = edition;

    }
    public Book(int index, int edition, String author) {
        super(index);
        this.author = author;
        this.edition = edition;

    }

    ///////////////////////////Methods//////////////////////////////////


    public int getEdition(){return edition;}
    public String getAuthor(){return author;}
    public void setAuthor(String author){this.author = author;}
    public void setEdition(int edition) {this.edition = edition;}


    @Override
    public String Borrow() {
        return "Can Borrow";
    }

}
