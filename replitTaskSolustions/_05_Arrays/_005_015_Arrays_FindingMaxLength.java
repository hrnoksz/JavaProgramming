package _05_Arrays;

import java.util.Scanner;

public class _005_015_Arrays_FindingMaxLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < words.length; i++) {
            words[i] = input.nextLine();
        }
        int length = 0;
        String result = "";
        for (String word : words) {
            if(word.length()> length){
                length = word.length();
                result = word;
            }
        }
        System.out.println(result);

        }

    }

/*
Given the array words find and print the word with the largest length. Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */