package _04_Loops;

import java.util.Scanner;

public class _04_001_Loops_ShoppingList2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        for(int i = 1; i<=10; i++){
            System.out.println("Enter Item"+i+" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport += "Item"+i+": "+item+" Price: "+price;
            totalPrice+=price;
            System.out.println("Add one more item?");
            countinue = scan.next();
            if(countinue.equals("no")){
                System.out.println(shoppingListReport);
                System.out.println("Total price: "+totalPrice);
                System.exit(0);
            }else{
                shoppingListReport+=", ";
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