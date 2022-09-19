package day13_StringClass;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        scan.close();

        if(str1.length()>str2.length()){
            System.out.println(str1);
        }else if(str2.length() > str1.length()){
            System.out.println(str2);
        }else{
            System.out.println("Both have same length");
        }

    }
}
/*
2. write a program that asks user to enter two strings, and print out the longest string
 */