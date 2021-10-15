package softwareinstitute;


public class Comic extends LibraryItem implements Borrowable {
    ///////////////////////////Attributes//////////////////////////////////
    private String brand;
    private String author;




    ///////////////////////////Constructors//////////////////////////////////

    public Comic(String title){
        super(title);
    }

    public Comic(int index){
        super(index);
    }

    @Override
    public void director(String directorName) {

    }

    @Override
    public void author(String authorName) {

    }

    @Override
    public void releaseYear(int year) {

    }

    @Override
    public void getAuthor(String author) {

    }

    @Override
    public void getEdition(int edition) {

    }





    @Override
    public int getReleaseYear(int releaseYear) {
        return 0;
    }


    public Comic(String brand, String author, String title){
        super(title);
        this.author = author;
        this.brand = brand;
    }

    public Comic(String brand, String author, int index){
        super(index);
        this.author = author;
        this.brand = brand;
    }



    ///////////////////////////Methods//////////////////////////////////


    public String getBrand(){return brand;}
    public String getAuthor(){return author;}
    public void setAuthor(String author){this.author = author;}
    public void setBrand(String brand) {this.brand = brand;}

    @Override
    public void loanDuration() {

    }
}
