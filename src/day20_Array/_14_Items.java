package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _14_Items {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] items = new String[5];
        double[] price = new double[5];

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter item name and its price");
            items[i] = scan.next();
            price[i] = scan.nextDouble();
        }
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(price));

        double totalPrice = 0;
        for (int i = 0; i < price.length; i++) {
            totalPrice += price[i];
        }
        System.out.println("Total price: " + totalPrice);

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "--" + price[i]);
        }
    }
}
/*
1. Create an array named items with the length of 5
2. Create an array named prices with the length of 5
3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
4. calculate the total price of the arrays
5. display each item name and price in separate lines

						ItemName -- Price
 */