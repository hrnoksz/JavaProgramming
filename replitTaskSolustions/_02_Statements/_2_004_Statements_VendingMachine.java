package _02_Statements;

import java.util.Scanner;

public class _2_004_Statements_VendingMachine {

    public static void main(String[] args) {

        int number, quarters, dimes, nickels, pennies;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 99:");
        //String name;
        number = scanner.nextInt();
        //name = scanner.nextLine();
        /*
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;

         */
        // if the number is 99, and then 99 cents = 3 quarters, 2 dimes, 0 nickels and 4 pennies
        // quarters = 99 / 25 = 3
        // dimes = (99-(25*3))/10 = 2
        // nickels = (99-(25*3)-(2*10))/5 = 0
        quarters = number/25;
        dimes = (number - (25*quarters))/10;
        nickels = (number - (25*quarters) - (dimes*10)) /5;
        pennies = (number - (25*quarters) - (dimes*10) - (nickels*5));

        if (number > 0 && number < 100) {
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, "
                    + nickels + " nickels, and " + pennies + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }

    }
}

/*
Write a program that will determine the change given from the vending machine.
The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

The given cents value should be more than 0 and less than 100.
If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format: Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
System.out.println("Enter cents:");

    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();

    int quarters = number/25;
    int dimes = (number - (25*quarters))/10;
    int nickels = (number - (25*quarters) - (dimes*10)) /5;
    int pennies = (number - (25*quarters) - (dimes*10) - (nickels*5));


    boolean a = number >= 0 && number <= 100;
    boolean b = !a;

    if(a){
      System.out.println("Your change is " + quarters  + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");
    }

    if(b){
      System.out.println("Invalid cents amount");
 */