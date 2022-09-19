package day15_ForLoop;

import java.util.Scanner;

public class _08_Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        scan.close();
        char ch;
        String reverseWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            ch = word.charAt(i);
            reverseWord += ch;

        }
        System.out.println(word.equalsIgnoreCase(reverseWord));

    }
}
/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level
				output:
					true

				input:
					Anna
				output:
					true
 */