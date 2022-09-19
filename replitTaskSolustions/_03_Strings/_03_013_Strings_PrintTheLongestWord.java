package _03_Strings;

import java.util.Scanner;

public class _03_013_Strings_PrintTheLongestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();
        int l1 = word1.length();
        int l2 = word2.length();
        String result = "";
        if (l1 > l2){
            result = word1;
        }else{
            result = word2;
        }
        System.out.println(result);


    }
}
/*
Write a program that will print out the longest word.
Note: Assume the length of the two given Strings will be different
input:
bill
check
output: check
 */