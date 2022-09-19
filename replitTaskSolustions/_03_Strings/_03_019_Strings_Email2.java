package _03_Strings;

import java.util.Scanner;

public class _03_019_Strings_Email2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        scan.close();

        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("First name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println("Domain: " + domain);

    }
}
/*
Write a program that will print out information about user based on email.
Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter
and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */