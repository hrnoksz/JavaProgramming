package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData); // default access modifier is not visible outside package
       // System.out.println(AccessModifiers.privateData); // private access modifier is not visible outside class

        AccessModifiers.method1();
      // AccessModifiers.method2(); // default access modifier is not visible outside package
        // AccessModifiers.method3(); // private access modifier is not visible outside class

    }
}
