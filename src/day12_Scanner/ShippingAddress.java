package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:"); //Java ProgrammingEnter
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = input.next(); //7925A

        input.nextLine();// Enter

        System.out.println("Enter your Street name:");
        String street = input.nextLine();

        System.out.println("Enter your city name:");
        String city = input.nextLine();

        System.out.println("Enter your state:");
        String state = input.next();

        System.out.println("Enter your zip code:");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country name:");
        String country = input.nextLine();

        String shippingAddress = fullName + "\n" + buildingNumber + " " + street + "\n" + city +", " + state + " " + zipCode;
        System.out.println(shippingAddress);

        input.close();


    }
}
/*
1. Enter your full name
2. Enter your building number
3. Enter your Street name
4. Enter your city name
5. Enter your state
6. Enter your zip code

Display the shipping address
 */