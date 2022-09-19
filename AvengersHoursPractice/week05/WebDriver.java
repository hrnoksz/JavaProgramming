package week05;

public class WebDriver {

    String browserType; // instance variable

    public WebDriver(String browserType){ // one parameter constructor
        this.browserType = browserType;
    }

    /*
    Method Overloading Examples:
    1. Happens in the same class
    2. Same name but different parameters
    3. Return type does not matter, it can be same or not
    4. Access modifier can be different
    5. private final methods can be overloaded
    6. static method can be overloaded
    7. Any methods in java can be overloaded.

    ----8 different locators
     */

    public String findElement(ID id){ // I want to overload this with different locator objects
        return id.locator;
    }

    protected String findElement(TagName tagName){ // same name but with different parameter
        return tagName.locator;
    }

    public void findElement(Name name){
        System.out.println("Locating the web element with name locator");
    }

    private final String findElement(ID id, Name name, TagName tagname){
        return "We are using all the locators";
    }

    public static void clickElement(ID id){
        System.out.println("Clicking on " + id.locator);
    }

    public static  void clickElement(Name name){
        System.out.println("Clicking on " + name.locator);
    }

    public Locators navigateTo(String link){
        Locators locators = new Locators(link);
        return locators;
    }
}

