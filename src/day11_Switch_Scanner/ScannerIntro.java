package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // in means input; out means output
        System.out.println("Enter an integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal:");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1*num2));

        input.close(); // closes the scanner, after this line scanner cannot be used anymore.

        int i = 10;
        if(i<10){
            System.out.println("too short");

        }else{
            System.out.println(i++);
        }





    }
}
