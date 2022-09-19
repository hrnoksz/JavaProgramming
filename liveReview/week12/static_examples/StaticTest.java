package week12.static_examples;

public class StaticTest {

    public String instanceValue = "Selenium";
    public static String word = "Java";

    public static void main(String[] args) {

        //System.out.println(instanceValue); //instance variable
        System.out.println("word = " + word);

        //I want to use displayMessage method, do I have to create a object? NOOOOOO

        StaticMethod.displayMessage("Hello static function");
        StaticMethod object = new StaticMethod();
        object.displayMessage("Hello, I am using object to call you");

        System.out.println(StaticMethod.count);
        System.out.println(object.count);

        StaticMethod object2 = new StaticMethod();
        System.out.println(object2.num);
        object2.count = 15;

        System.out.println(object.count); // 5

        // call instance method
       // StaticMethod.instanceMethod(); compiler error

        object.num = 3;
        object2.num = 4;

        object.instanceMethod();
        object2.instanceMethod();


    }
}
