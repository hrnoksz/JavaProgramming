package day45_Abstraction;

import javax.xml.crypto.Data;

public interface PropertiesOfInterface {

    // Interface is not a class, it is template/blueprint of class
    // We cannot create objects from interface, because it is not a class
    // We can use ONLY public access modifier

    // int a; Inheritance cannot have any instance variables
    static int b = 100; // (final by default) Inheritance can have ONLY static variables (final & static by default)
                        // And it must be initialized immediately before use it
    int a = 100; // final & static by default

    /*
    public PropertiesOfClass(int a){ // Interface cannot have constructor, because it is not class
        this.a = a;
    }
     */
    /*
    static { // Interface cannot have any blocks, because it is not class
        b = 100;
    }
     */

/*
    public void method1(){ // Inheritance cannot have any instance methods
        System.out.println("Instance method");
    }

 */

    public static void method2(){ // Inheritance can have static method. (public by default). ONLY one copy for all objects
        System.out.println("Static method");
    }

    public abstract void method3(); // Inheritance can have abstract method and access modifier must be public for
    // abstract method. (public & abstract by default)

    public default void method4(){ // Inheritance can have default method. Here default is not access modifier, it is specifier
                                   // (public by default)
        System.out.println("Default method");
    }
}
class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        //default void method4(); // default method.
    }
}