package _03_Strings;

import java.util.Scanner;

public class _03_004_Strings_FindFirstCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char firstCharacter = word.charAt(0);
        System.out.println(firstCharacter);

    }
}
/*
Write a program that will print out the first character of the word.

Ex:

Input: jump

Output: j
 */