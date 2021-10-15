package softwareinstitute;



public abstract class LibraryItem {

    ///////////////////////////Attributes//////////////////////////////////
    private String title;
    private int index;


    ///////////////////////////Constructors//////////////////////////////////



    public LibraryItem(String title){
        this.title = title;
    }
    public LibraryItem(int index) {this.index = index;}




    ///////////////////////////Methods//////////////////////////////////

    public abstract void director(String directorName);
    public abstract void author(String authorName);
    public abstract void releaseYear(int year);


    public String getName() {
        return title;
    }
    public void setName(String title) {
        this.title = title;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex() {return index;}

    public abstract void getAuthor(String author);
    public abstract void getEdition(int edition);
    public abstract int getReleaseYear(int releaseYear);











}


