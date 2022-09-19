package _04_Loops;

import java.util.Scanner;

public class _004_013_Loops_PrintNTimes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }


    }
}
/*
Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

Example:

input: 1
output: *
 */