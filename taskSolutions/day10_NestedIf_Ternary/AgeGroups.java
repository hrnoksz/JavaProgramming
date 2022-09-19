package day10_NestedIf_Ternary;

import java.util.Scanner;

public class AgeGroups {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an age");
        int age = scanner.nextInt();
        String result = "";

        boolean valid = age >= 0 && age <= 150;

        if (valid) {
            if (age >= 55) {
                result = "Senior";
            } else if (age >= 21) {
                result = "Adult";
            } else {
                result = "Teenager";
            }
        } else {
            result = "Invalid";
        }

        System.out.println(result);
    }
}


/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */