package Day52_Map_FunctionalInterface;

@FunctionalInterface
public interface MyInterface<T> {

    void function(T a); //It can contain ONLY one abstract method.
                        // T can be any data types

    public static void main(String[] args) { //But it can contain static, default etc method except one abstract method

    }

    default void method1(){

    }
}
