package week13.bookTask;

public class BookShop {

    public static void main(String[] args) {

        Book bookOne = new Book();
        bookOne.title = "Intro to Java";
        bookOne.author = "Savitch";
        bookOne.type = "Programming";
        bookOne.price = 12.50;

        System.out.println("bookOne = " + bookOne);

        AudioBook audioBook =  new AudioBook("Selenium Cookbook","Automation","Unmesh",
                44.99,60,"Irina");

        audioBook.listen();

        //can I call parent class method with child class object?
        audioBook.buy();
    }
}
