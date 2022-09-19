package day16_ForLoop;

import java.util.Scanner;

public class _04_FrequencyOfJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        sentence = sentence.replaceAll(" ", "");
        System.out.println("Enter word for which you find frequency:");
        String word = scan.next();
        int count = 0;
        for (int i = 0; i <= sentence.length()-4; i++) {
            String s = sentence.substring(i, i+4);
            if(s.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);


    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2
 */