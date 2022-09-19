package _03_Strings;

import java.util.Scanner;

public class _03_010_ReverseIt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        String result = "";
        if(word.length()==5){
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);

        }else if(word.length()<5){
            result = "Too short!";
        }else{
            result = "Too long!";
        }
        System.out.println(result);
    }
}



/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */