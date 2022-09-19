package day51_Map;

public class Browser1Test {

    public static void main(String[] args) {

        Browser1 browser1 = Browser1.SAFARI;

        switch (browser1){
            case CHROME:
                System.out.println("Chrome is selected");
                break;
            case EDGE:
                System.out.println("Edge is selected");
                break;
            case OPERA:
                System.out.println("Opera is selected");
                break;
            case SAFARI:
                System.out.println("Safari is selected");
                break;
            default:
                System.out.println("Firefox is selected");
        }
    }
}
