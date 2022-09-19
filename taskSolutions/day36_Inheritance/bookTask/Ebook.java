package day36_Inheritance.bookTask;

public class Ebook extends Book{

    private String size;
    private int pages;

    public void setInfo(String title, String type, String author, double price, String size, int pages){
        setInfo(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("reading "+getTitle());
    }

    public String toString() {
        return "Ebook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price= $" + getPrice() + '\'' +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
/*
3.2 Create a subclass of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */