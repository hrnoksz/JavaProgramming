package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name:");
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        scan.close();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        //firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        //firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
        // We use empty string to concatenate char and String

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        //lastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();
        //lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        System.out.println(firstName + " " + lastName);

    }
}
/*
3. Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */