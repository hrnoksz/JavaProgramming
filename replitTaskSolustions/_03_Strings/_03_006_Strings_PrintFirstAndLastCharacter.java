package _03_Strings;

import java.util.Scanner;

public class _03_006_Strings_PrintFirstAndLastCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        System.out.println(first+""+last);

   }
}
/*
Write a program that will print out first and last letters together.
Input: adobe
Output: ae
 */