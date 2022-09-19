package day10_NestedIf_Ternary;

import java.util.Scanner;

public class BiggerNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        String result = (n1 > n2 && n1 > n3)? "n1 is bigger" :(n2 > n1 && n2 > n3)? "n2 is bigger" : "n3 is bigger";
        System.out.println("result = " + result);


    }
}
/*
Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */