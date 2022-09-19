package _06_Methods;

import java.util.Scanner;

public class _06_001_Methods_SimpleCalculator {

    public static void main(String[] args) {

        plus();
    }
    public static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scan.nextInt();
        System.out.println("enter second number");
        int num2 = scan.nextInt();
        System.out.println("result: "+(num1+num2));
    }
}
/*
Implement the plus method. The return is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */
