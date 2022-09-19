package day36_Inheritance.bookTask;

public class AudioBook extends Book{

    private String length, narrator;

    public void setInfo(String title, String type, String author, double price, String length, String narrator){
        setInfo(title, type, author, price);
        setNarrator(narrator);
        setLength(length);
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void listen(){
        System.out.println("Listening to " + getTitle());
    }

    public String toString() {
        return "AudioBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price= $" + getPrice() + '\'' +
                ", length='" + length + '\'' +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
/*
3.3 Create a subclass of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()

 */