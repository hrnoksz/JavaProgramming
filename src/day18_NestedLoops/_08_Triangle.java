package day18_NestedLoops;

import java.util.Scanner;

public class _08_Triangle {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


/*
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i <=n; i++) {
            System.out.println("* ".repeat(i));

        }

 */


    }
}
/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */