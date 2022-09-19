package week17.interface_demo;

public class FirefoxDriver implements WebDriver{

    public FirefoxDriver(){
        System.out.println("Launching Firefox Browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Firefox  - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Firefox - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("Firefox - quitting the driver");
    }

    @Override
    public String getTitle() {
        return "EU8 UI Automation";
    }

    public void someUniqueMethodForFirefox(){
        System.out.println("I am just belonging to FirefoxDriver class");
    }
}
