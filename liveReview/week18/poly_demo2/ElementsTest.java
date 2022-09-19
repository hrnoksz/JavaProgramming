package week18.poly_demo2;

public class ElementsTest {

    public static void main(String[] args) {

        Links links = new Links(); // no poly
        links.click();
        links.getText();
        links.sendKeys("EU8");
        links.getLinkHref();

        WebElement loginLink = new Links(); //There is polymorphic way
        loginLink.click(); //dynamic poly / Dynamic binding
        String text = loginLink.getText();
        System.out.println("text = " + text);
        ((Links)loginLink).getLinkHref(); //Explicit downcasting

        WebElement username = new InputField(); //There is polymorphic way
        username.click();
        username.getText();
        username.sendKeys("superman");
        ((InputField)username).getValue(); //This method can be reached with casting

        System.out.println("----Changed object of the reference type----");
        username = new Links(); // benefit of polymorphism
        username.click();
        ((Links)username).getLinkHref();

        username = new InputField();

        //two objects InputField, Links
        WebElementUtility.clickElement(loginLink);
        WebElementUtility.clickElement(username);
       // WebElementUtility.clickElement("Hello"); String class is not child of WebElement
        WebElementUtility.clickElement(links);

        WebElement login = WebElementUtility.getLinkWithText("login");
        login.click();
        ((Links)login).getLinkHref();


    }
}
