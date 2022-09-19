package _05_Arrays;

import java.util.Scanner;

public class _005_020_Arrays_PrintFirstAndLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
/*
        for (int i = 0; i < words.length; i++) {
           String word = words[i].substring(0,1)+words[i].substring(words[i].length()-1);
           System.out.println(word);

 */
        for (String word : words) {
            word = ""+word.charAt(0)+word.charAt(word.length()-1);
            System.out.println(word);
        }

        }

    }

/*
Given a String array words, iterate through each word and print first and
last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
 */