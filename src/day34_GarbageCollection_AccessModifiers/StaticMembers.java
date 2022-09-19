package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { // In order to create a static class, there must be nested class(outer and inner class)

    static class class1{  // in order to create  static class, static class has to be INNER class

    }

    public static int num = 10; // static variable

    public static void method(){ // static method

    }

    static { // static block

    }

}
class A { // outer class

    static class B {

        public static void method1(){

        }

    }
}

class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}


