package day38_Inheritance.browserTask;

public class FireFox extends Browser {


    public void openBrowser() {
        System.out.println("Opening firefox browser");;
    }

    public void closeBrowser() {
        System.out.println("Closing firefox browser");;
    }
}
/*
2. FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"
 */