package week18.poly_demo2;

public class Links implements WebElement{

    public void getLinkHref(){
        System.out.println("https://www.java.com");
    }

    @Override
    public void sendKeys(String text) {
        System.out.println("Not supported Action");
    }

    @Override
    public void click() {
        System.out.println("Click the link");
    }

    @Override
    public String getText() {
        System.out.println("getting link text");
        return "Oracle Java";
    }
}
