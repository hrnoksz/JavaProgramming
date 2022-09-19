package week05;

import java.util.Locale;
import java.util.Scanner;

public class EmailExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please a valid an email:");
        String email = scan.nextLine();

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        //firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        firstName = firstName.toUpperCase().charAt(0)+firstName.substring(1).toLowerCase();
        //lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);




    }
}
/*

 */