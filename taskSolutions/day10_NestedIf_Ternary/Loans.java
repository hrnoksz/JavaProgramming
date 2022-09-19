package day10_NestedIf_Ternary;

import java.util.Scanner;

public class Loans {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter salary and credit score");
        int salary = scanner.nextInt();
        int creditScore = scanner.nextInt();

        String result = (salary > 60_000 && creditScore > 650)? "Loan Approved" : "Loan Denied";

        System.out.println("result = " + result);


    }
}
/*
Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */