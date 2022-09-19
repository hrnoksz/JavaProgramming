package _06_Methods;

import java.util.Scanner;

public class _06_003_Methods_FindCube {

    public static void main(String[] args) {

        cube();

    }
    public static void cube(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        int cube = num*num*num;
        System.out.println(cube);
    }


}
/*
Create a method called cube. It is a void method with no arguments.
Write all required code inside this method in order to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5

output: 125

hint: cube of a number n = n^3
 */