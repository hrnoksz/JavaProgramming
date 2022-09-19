package day13_StringClass;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        String word3 = scan.nextLine();
        scan.close();

        String result = "";

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        if(length1 == length2 && length1 == length3){
            result = "All words are same length";
        }else if(length1 == length2){
            result = "Not Same nor Different lengths";
        }else if (length1 == length3){
            result = "Not Same nor Different lengths";
        }else if (length2 == length3){
            result = "Not Same nor Different lengths";
        }else{
            result = "All different length";
        }
        System.out.println(result);


    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */