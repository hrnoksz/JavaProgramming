package day13_StringClass;

import java.util.Scanner;

public class InitialsOfUser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        char first = firstName.toUpperCase().charAt(0);
        char first1 = lastName.toUpperCase().charAt(0);

        String initial = first + "." + first1;
        System.out.println(initial);

        scan.close();

    }
}
/*
4. write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
        Note: Pay attention to the example output
 */