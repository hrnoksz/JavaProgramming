package _04_Loops;

import java.util.Scanner;

public class _004_016_Loops_RepeatSeparator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = "";

        for (int i = 0; i < count-1; i++) {
            result += word+separator;
        }
        System.out.println(result+word);


    }
}
/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.

Example:

input:
Word
X
3

output: WordXWordXWord
 */