package _03_Strings;

import java.util.Scanner;

public class _03_005_PrintLastCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        char lastCharacter = word.charAt(word.length()-1);
        System.out.println(lastCharacter);



    }
}
/*
Write a program that will print out last letter of the word (string).

Ex:

Input: java

Output: a
 */