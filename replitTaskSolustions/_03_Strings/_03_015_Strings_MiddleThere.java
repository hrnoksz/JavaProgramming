package _03_Strings;

import java.util.Scanner;

public class _03_015_Strings_MiddleThere {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        String result = "";
        int length = word.length();
        if(length %2 != 0 && length >= 5){
            result = word.substring(length/2-1, length/2+2);
        }else{
            result = "invalid";
        }
        System.out.println(result);


    }
}
/*
Given a String variable word print the middle three characters if the word is an odd number of characters and
has more than 5 characters. If the word does not meet the requirements print invalid.
 */