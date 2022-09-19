package Day52_Map_FunctionalInterface;

public class MyInterfaceTest {

    public static void main(String[] args) {

        MyInterface<Integer> cube = p -> System.out.println(p * p * p);

        cube.function(10); //1000

        System.out.println("-----------------------------------------------");

        MyInterface<Integer> odOrEven = p -> {
            if(p %2 == 0){
                System.out.println(p + " is even");
            }else{
                System.out.println(p + " is odd");
            }
        };

        odOrEven.function(5); //5 is odd

        System.out.println("-------------------------------------------");

        MyInterface<String> reverse = str -> {
            String result = "";
            for (int i = str.length()-1; i >=0 ; i--) {
                result += str.charAt(i);
            }
            System.out.println(result);
        };
        reverse.function("Harun"); //nuraH

        reverse.function("Aysen"); //nesyA


    }
}
