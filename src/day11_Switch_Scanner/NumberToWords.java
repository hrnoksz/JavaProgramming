package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        String result = (num >= 0 && num <= 9)?
                        (num == 0)? "zero" :(num == 1)? "one" :(num == 2)? "two" :(num == 3)? "three" : (num == 4)? "four"
                                :(num == 5)? "five" :(num == 6)? "six" :(num == 7)? "seven" :(num == 8)? "eight" : "nine"
                        : "invalid number";
        System.out.println("result = " + result);

    }
}
/*
2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */