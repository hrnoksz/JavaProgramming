package day16_ForLoop;

import java.util.Scanner;

public class _02_FrequencyOfChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        System.out.println("Enter a char:");
        char ch = scan.next().charAt(0);
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== ch){
               frequency++;
            }
        }
        System.out.println(frequency);

    }
}
/*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */