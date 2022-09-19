package _02_Statements;

import java.util.Scanner;

public class _02_026_Statements_TernaryOperator1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();

        int result = (x >= 5)? x : -x;
        System.out.println(result);

    }
}
/*
Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:

Display x if x is greater than or equal to 5 Display -x if x is less than 5
 */