package week14.browserPagesInheritance;

public class Browser {

    private static String browserType;  // it can be chrome, safari, edge, firefox...

    private static String operatingSystem; // it can be windows, androids, IOs...

    public Browser(String name){
        browserType = name; // we don't need to use "this" keyword
    }

    static {
        operatingSystem = "Windows";
    }

    public String getName(){
        return browserType;
    }

    public void closeBrowser(){
        browserType = null;
    }

    public void setName(String name){ //Our setter methods checks if there ia already an open browser type before setting
                                      // a new one
        if(browserType==null){
            this.browserType=name;
        }else{
            System.out.println("There is already an open browser: " + browserType);
            //only sets a new one if there is no browser assigned
        }
    }

    public static String getOSName(){
        return operatingSystem;
    }
}
