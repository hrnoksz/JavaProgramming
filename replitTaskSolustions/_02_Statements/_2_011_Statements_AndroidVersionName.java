package _02_Statements;

import java.util.Scanner;

public class _2_011_Statements_AndroidVersionName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        String result = (version == 1.5)?"Cupcake" :(version == 1.6)?"Donut" :(version == 2.1)? "Eclair"
                :(version == 2.2)? "Froyo" :(version == 2.3)? "Gingerbread" :(version == 3.1)? "Honeycomb"
                :(version == 4.0)? "Ice Cream Sandwich" :(version == 4.1)? "Jelly Bean" :(version == 4.4)? "KitKat"
                :(version == 5.0)? "Lollipop" :(version == 8.0)?"Oreo" :(version == 9.0)? "Pie"
                :"Sorry, I don't know this version!";

        System.out.println(result);

    }
}
/*
Create an object of Scanner class named scanner. (DONE)
Create double variable named version. (DONE)
Write an if statement that will print android version name based on value of the version variable.
Versions 1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1 - Honeycomb 4.0 - Ice Cream Sandwich 4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie

Example:

input: 1.5
output: Cupcake

input: 9.0
output: Pie

input: 11.0
output: Sorry, I don't know this version!
 */