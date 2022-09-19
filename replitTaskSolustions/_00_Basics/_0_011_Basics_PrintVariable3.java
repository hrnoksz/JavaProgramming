package _00_Basics;

import java.util.Scanner;

public class _0_011_Basics_PrintVariable3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();

        System.out.println("num= "+ num + " cost= " + cost);


    }
}
/*Given two variables num and cost that have been declared and given values, write a statement to print the values.
Ex:Input: 2 5
Output: num= 2 cost= 5.0
 */