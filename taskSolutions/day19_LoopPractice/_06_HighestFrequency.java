package day19_LoopPractice;

import java.util.Scanner;

public class _06_HighestFrequency {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = str.charAt(0);
        int highestFrequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch1 == each){
                    count++;
                }
            }if(count > highestFrequency){
                highestFrequency = count;
                ch = str.charAt(i);
            }

        }
        System.out.println(ch + " has the highest frequency, and its frequency is " + highestFrequency);
    }
}
/*
Write a program that can find the character that has the highest frequency from a string
 */