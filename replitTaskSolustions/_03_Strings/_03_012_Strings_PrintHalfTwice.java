package _03_Strings;

import java.util.Scanner;

public class _03_012_Strings_PrintHalfTwice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        int length = word.length();
        word = word.substring(0, length/2);
        word = word.repeat(2);
        System.out.println(word);

    }
}
/*
Write a program that will print out first half of the word twice.
Example:
input: java
output: jaja
 */