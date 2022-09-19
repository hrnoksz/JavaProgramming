package _02_Statements;

import java.util.Scanner;

public class _2_014_Statements_FindMidNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();

        boolean num1IsMidNum = (num1>num2 && num1<num3)|| (num1>num3 && num1<num2);
        boolean num2IsMidNum = (num2>num1 && num2<num3) || (num2>num3 && num2 < num1);

        if(num1IsMidNum){
            System.out.println("Medium value is: " + num1);
        }else if(num2IsMidNum){
            System.out.println("Medium value is: " + num2);
        }else{
            System.out.println("Medium value is: " + num3);
        }


    }
}
/*
Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.

Example:

Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
 */