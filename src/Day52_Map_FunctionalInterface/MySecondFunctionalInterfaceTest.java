package Day52_Map_FunctionalInterface;

public class MySecondFunctionalInterfaceTest {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };
        printEach.test("Harun");

        System.out.println("===============================================");

        MySecondFunctionalInterface<Integer> cube = n -> System.out.println(n*n*n);
        cube.test(3);

    }

}
