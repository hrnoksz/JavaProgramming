package week05;

import java.util.Scanner;

public class EmailCheckInterview {

    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your email:");
        String email = scan.next();

        System.out.println(email.contains("@") && email.contains(".")
                && email.indexOf("@") >0
                && email.indexOf(".") > email.indexOf("@") +1
                && email.lastIndexOf(".") < email.length()-1);

 */
        /*
        scanner to get email input
        boolean result set to true at the beginning
        if(conditions){
        result = false
        }
        indexOf("@")<1: 0 (no character before @ sign) or -1 (there is no @ sign)
        indexOf("@") >= email.length()-3  (a@a.a: indexOf("@")
        what if we have 2 or more @ sign
        the index of @ sign == last index of @ sign ==> there is one @ sign, otherwise problem
        DOT conditions:
        indexOf(".")<1: 0 (no character before dot sign) or -1 (there is no dot sign)
        indexOfDotSign == email.length()-1 ==> problem
        the index of @ sign > bigger than indexOfDotSign ==> problem
        the index of @ sign + 1 == indexOfDotSign(@.) : there is no character in between== > problem
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please put a valid email address: test@example.com");
        String email = input.next();

        boolean result = true;

        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        if(atSignIndex<1 //  0 (no character before @ sign) or -1 (there is no @ sign)
                ||atSignIndex>=email.length()-3 // (a@a.a: indexof("@):equal to length()-4 or less )
                ||atSignIndex!=email.lastIndexOf("@")) // there is onle one @ sign, or if they are not equal means more @ sign
        {
            result = false;
        }
        if( dotIndex < 1 // 0 (no character before dot sign) or -1 (there is no dot sign)
                || dotIndex == email.length()-1 // checking if it is the last character
                || atSignIndex > dotIndex  // checking if @ sign is before dot sign
                || atSignIndex+1 == dotIndex){ // checking if there is a character between @ sign and dot sign
            result = false;
        }

        System.out.println("result = " + result);

    }
}
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */

