package _04_Loops;

import java.util.Scanner;

public class _004_010_Loops_EachLetter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }


    }
}
/*
Given a String, use a loop to print every character from the String on a new line.

Examples:

Input: hello
h
e
l
l
o
 */