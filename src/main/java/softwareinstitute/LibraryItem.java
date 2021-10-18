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













}


