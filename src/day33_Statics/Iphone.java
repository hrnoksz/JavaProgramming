package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String OS = "IOS";

    public String color;

    public String size;

    public static String madeIn;

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    /*
    public static void printModelAndPrice(){
       System.out.println(model+" : "+price); static method cannot use instance variable
       It accepts only static variables
    }
     */
    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS); // instance method can use static variables, because objects come from class
    }

    public static void printOperatingSystem(){
        System.out.println(OS); // only one copy which shared all objects
                                // without creating any objects, we can use static methods.
    }

}
