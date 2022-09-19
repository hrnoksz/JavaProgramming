package week05;

public class Chrome extends WebDriver{

    public Chrome(String browserType) {
        super(browserType);
    }
    /*
    Method Overriding Rules:
    1. Same name with same parameter
    2. Return type same or covariant (sub-class, sub-type)
    3. private and final method cannot be overridden
    4. Access modifier of overriding method in child class should be same or more visible
    5. Static methods cannot be overridden, they can be hidden
    6. @Override annotation should be applicable
     */
    public ID navigateTo(String link){ //Covariant of Locators are: ID, Name or TagName class objects
        return new ID(link);
    }
    /*
    @Override (rule 6)
    public static void clickElement(ID id){
        System.out.println("Clicking on " + id.locator);
    }
     */
}
