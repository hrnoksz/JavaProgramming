package week18.poly_demo2;

public class InputField implements WebElement{

    public String getValue(){
        System.out.println("Getting value of the inputField");
        return "Selenium";
    }

    @Override
    public void sendKeys(String text) {
        System.out.println("Typing into input field " + text);
    }

    @Override
    public void click() {
        System.out.println("Clicking on the input field");
    }

    @Override
    public String getText() {
        System.out.println("Getting text of input field");
        return "JAVA";
    }
}
