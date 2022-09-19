package day17_While_DoWhile;

import java.util.Scanner;

public class _05_RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String a = scan.next().toLowerCase();
        int price = 0;

        while (!(a.equals("yes") || a.equals("no"))) {
            System.out.println("Invalid entry, please re-enter");
            a = scan.next().toLowerCase();
        }
        if (a.equals("yes") || a.equals("no")) {
            if (a.equals("yes")) {
                System.out.println("Which type of room do you want to reserve?");
                String type = scan.next().toLowerCase();
                while (!(type.equals("king") || type.equals("queen") || type.equals("single"))) {
                    System.out.println("Invalid entry, please re-select:");
                    type = scan.next().toLowerCase();
                }
                if (type.equals("king")) {
                    price = 120;
                } else if (type.equals("queen")) {
                    price = 100;
                } else if (type.equals("single")) {
                    price = 80;
                }
                System.out.println("Your total price: $" + price);
            } else {
                System.out.println("have a nice day");
            }

        }

    }
}





/*

5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
 if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */