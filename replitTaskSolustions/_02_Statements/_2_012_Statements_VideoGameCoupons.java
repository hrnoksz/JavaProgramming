package _02_Statements;

import java.util.Scanner;

public class _2_012_Statements_VideoGameCoupons {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = scanner.nextInt();

        int candies = 0;
        int gumballs = 0;

        if(coupons > 2){

            candies = coupons / 10;
            coupons = coupons - candies*10;

            gumballs = coupons / 3;
            coupons = coupons - gumballs * 3;
        }else{
            System.out.println("Not enough coupons");
        }

        System.out.println("Number of Candies: " + candies);
        System.out.println("Number of Gumballs: " + gumballs);

    }
}
/*
The video games machines at your local arcade outputs coupons according to how well you play the game.

You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
Write a program that displays how many candy bars and gumballs you can get. You prefer candy bars.

if your coupons are not enough for any redeem, display message:

"Not enough coupons"

Example:

Input:
Enter number of coupons:
13
Output: Number of Candies: 1
Output: Number of Gumballs: 1

Input:
Enter number of coupons:
23
Output: Number of Candies: 2
Output: Number of Gumballs: 1

Input:
Enter number of coupons:
2

Output: Not enough coupons
 */