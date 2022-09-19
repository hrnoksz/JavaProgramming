package _03_Strings;

import java.util.Scanner;

public class _03_014_Strings_StringNoEnd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        scan.close();
        txt = txt.substring(0, txt.length()-1);
        System.out.println(txt);

    }
}
/*
Given a String txt print the value without the last letter
Ex:

Input:
foo
Output:
fo
 */