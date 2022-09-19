package day53_FunctionalInterface;

public class MyInterfaceTest {

    public static void main(String[] args) {

        //1. Create a function that takes one integer and returns the cube of the given argument
        MyInterface<Integer> cubes =
                p-> {
                    int cubeOfNumber = p * p * p;
                    return cubeOfNumber;
                };
        int cube = cubes.method(2);
        System.out.println(cube); //8

        System.out.println("---------------------------------------------------------");
        //2. Create a function that takes a String and returns the reversed value of the given argument
        MyInterface<String> reversed =
                str -> {
                    String reversStr = new StringBuilder(str).reverse().toString();
                    return reversStr;
                };
        String reverse = reversed.method("Wooden Spoon");

        System.out.println(reverse); //noopS nedooW
    }
}
/*
2.1 Create a class named Test and use the custom functional interface above to create the following functions:
				1. Create a function that takes one integer and returns the cube of the given argument
				2. Create a function that takes a String and returns the reversed value of the given argument
 */