package day08_SingleIfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int number1 = 25;
        int number2 = 15;

        if(number1 > number2){
            System.out.println(number1 + " is maximum number");
        }
        if(number1 < number2){
            System.out.println(number2 + " is maximum number");
        }
        if(number1 == number2){
            System.out.println(number1 + " and " + number2 + " are equal");
        }

    }
}
/*
Write a program that can print the maximum number between two numbers, if both are equal then print Equal
			Ex:
				n1= 100, n2 = 200;
			output:
				200 is maximum number
 */