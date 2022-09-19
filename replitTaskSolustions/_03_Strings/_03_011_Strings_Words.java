package _03_Strings;

import java.util.Scanner;

public class _03_011_Strings_Words {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        s.close();
        if(word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }


    }
}
/*
In this assignment you are given two string variables word1 and word2.
Check if they are equal
Comparison should be case sensitive. "java" and "JaVa" are not equal.
if they are equal output "word1 equals word2"
otherwise output "word1 does not equal word2"
 */