package week03;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        // Let's get the input from user, for this we need to create scanner object
        // I want you declare 5 variables as double data type num1, num2, num3, num4 and total

        Scanner scan = new Scanner(System.in);

        double num1, num2, num3, num4, total; // declaring variables

        System.out.println("Enter 4 numbers");

        num1 = scan.nextDouble(); // initialize variable (hard coded way)
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();
        num4 = scan.nextDouble();
        total = num1 + num2 + num3 + num4;

        System.out.println("total = " + total);
    }
}
