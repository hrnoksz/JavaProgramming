package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData); // private is not visible outside the class

        AccessModifiers.method1(); //Public
        AccessModifiers.method2(); //Default
        //AccessModifiers.method3(); // Compiler error==> private is not visible outside the class
    }
}
