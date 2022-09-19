package week13.bookTask;

public class Ebook extends Book{

    int size;
    int pages;

    public Ebook(String title, String type, String author, double price, int size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("reading the book from my tablet");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = $" + price);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);

    }


}
