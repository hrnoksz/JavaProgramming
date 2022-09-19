package day45_Abstraction;

public abstract class PropertiesOfAbstractClass {

    int a; // instance variable
    static int b; // static variable

    public PropertiesOfAbstractClass(int a){ // constructor
        this.a = a;
    }

    static { // we use static block in order to initialize static variable
        b = 100;
    }

    public void method1(){ // Instance method accepts both instance and static variables
        System.out.println("Instance method");
    }

    public static void method2(){ // Static methods accepts only static variable
        System.out.println("Static method");
    }

    public abstract void method();


}
