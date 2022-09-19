package _04_Loops;

import java.util.Scanner;

public class _04_002_Loops_Party {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guestList = "";
        for (int i = 0; i < 20; i++) {
            System.out.println("Please enter guest name:");
            String name = input.next();
            guestList += name + ", ";
            System.out.println("Do you want to enter new guest name:");
            String yesNo = input.next();
            if (yesNo.equalsIgnoreCase("no")) {
                System.out.println("Guest's list: " + guestList);
                System.exit(0);
            }

        }
    }
}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guests.
If yes - take the next guest input
If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */