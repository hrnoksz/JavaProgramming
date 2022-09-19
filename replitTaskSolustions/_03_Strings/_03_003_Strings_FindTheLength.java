package _03_Strings;

import java.util.Scanner;

public class _03_003_Strings_FindTheLength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = scan.nextLine();
        scan.close();
        int lengthOfText = text.length();
        System.out.println("Length is: " + lengthOfText);

    }
}
/*
Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"
Display message: "Please enter the text:"
input: java

Display message: "Length is: 4"
 */