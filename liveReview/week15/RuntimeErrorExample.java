package week15;

import java.util.Scanner;

public class RuntimeErrorExample {

    public RuntimeErrorExample() {
    }

    public static void main(String[] args) {

        System.out.println("Hello");
        int x = 5;
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        try{
            System.out.println(x/y); //when user puts zero, this line will be skipped
                                    // unchecked exception which occurs in runtime.
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("How are you today?");
        System.out.println("Some more lines of code");
        System.out.println("we swallowed the exception object");

    }
}
