package week01;

import java.util.Scanner;

public class _02_StringPractice_01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(firstTwoChars(str));

        System.out.println(firstTwoChars3(str));

        System.out.println(firstTwoChars4(str));


    }
    public static String firstTwoChars(String str){
       return str.substring(0,2).toUpperCase();
    }

    public static String firstTwoChars3(String str){
        str = str.toUpperCase();
        String s = "" +str.charAt(0)+str.charAt(1);
        return s;
    }
    public static String firstTwoChars4(String str){
        char[] charArray = str.toCharArray();
        return (""+charArray[0]+charArray[1]).toUpperCase();
    }


}
/**
 * 1.Ask for a String ınput from user
 * 2.Create a method that will return  a string, print the string made of its first two chars,
 * so the String "Hello" yields “HE".
 */