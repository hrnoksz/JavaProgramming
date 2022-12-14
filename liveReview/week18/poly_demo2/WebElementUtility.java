package week18.poly_demo2;

public class WebElementUtility {

    //We will have a method with polymorphic parameter
    // An object reference of WebElement Interface

    public static void clickElement(WebElement element){
        System.out.println("Clicking on the Element");
        element.click(); // our element object is a polymorphic object and can reach either InputField
        //or Links class click implementation

    }
    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt " + txt);
        return new Links();  // new InputField()
    }

}
