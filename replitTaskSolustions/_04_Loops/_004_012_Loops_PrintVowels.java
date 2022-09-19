package _04_Loops;

import java.util.Scanner;

public class _004_012_Loops_PrintVowels {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            switch (ch){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    result += ch;
                    break;
            }
        }
        System.out.println(result);


    }
}
/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho
Output: oo
 */