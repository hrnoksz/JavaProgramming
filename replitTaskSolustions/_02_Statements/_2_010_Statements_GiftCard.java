package _02_Statements;

import java.util.Scanner;

public class _2_010_Statements_GiftCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();

        String result = "";

        switch(item){
            case "Blanket":
                result = "Thank you for your purchase! \nYour current balance is: 40$";
                break;
            case "Charger":
                result = "Thank you for your purchase!\nYour current balance is: 75$";
                break;
            case "Hat":
                result = "Thank you for your purchase! \nYour current balance is: 75$";
                break;
            case "Headphones":
                result = "Thank you for your purchase! \nYour current balance is: 70$";
                break;
            case "Laptop":
                result = "Sorry, not enough funds on your gift card!";
                break;
            case "Pants":
                result = "Thank you for your purchase! \nYour current balance is: 50$";
                break;
            case "Pillow":
                result = "Thank you for your purchase! \nYour current balance is: 60$";
                break;
            case "Smartphone":
                result = "Sorry, not enough funds on your gift card!";
                break;
            case "Socks":
                result = "Thank you for your purchase! \nYour current balance is: 95$";
                break;
            case "USB cable":
                result = "Thank you for your purchase! \nYour current balance is: 90$";
                break;
            default:
                result = "Invalid item!";
        }
        System.out.println(result);

    }
}
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$
Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$

input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$

input: Laptop
Output:
Sorry, not enough funds on your gift card!

input: Cupcake
output: Invalid item!
 */