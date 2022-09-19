package day13_String;

import java.util.Scanner;

public class Initial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter last name:");
        String lastName = scan.nextLine();

        char initialLetterOfFirstName = firstName.charAt(0);
        char initialLetterOfLastName = lastName.charAt(0);
        System.out.println(initialLetterOfFirstName +"." +initialLetterOfLastName);

        scan.close();


    }
}
/*
Task:
	initial:
		firstName = "Wooden";
		lastName = "Spoon";

	output:
		W.S
 */