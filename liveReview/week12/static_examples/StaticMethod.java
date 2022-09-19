package week12.static_examples;

public class StaticMethod {

    public int num = 10;

    public static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
        //System.out.println(num);  // Instance can not be called from static method
                                    // compile error because num is instance variable and belongs to object
                                    // this num has many copies.
                                    // instance cannot be called from static method
        System.out.println("count = " + count);
    }

    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("count = " + count); // I can call static field from instance method
        System.out.println("num = " + num);
    }
}
