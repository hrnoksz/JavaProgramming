package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishedDate;

    public EncapsulationReview(String bookTitle, String publishedDate) {
        setBookTitle(bookTitle);
        this.publishedDate = publishedDate;
    }

    public String getBookTitle(){ // we can put some condition within getter method()
        if(bookTitle == null){ //null is not an object
            return ""; //Empty string is at least an object
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle){
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate(){
        return publishedDate;
    }
    /*
    public void setPublishedDate(String publishedDate){
        this.publishedDate = publishedDate;
    }
    If private data is FINAL, we CANNOT generate setter method()
     */
}
