package _03_Strings;

import java.util.Scanner;

public class _03_024_Strings_WithoutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        if(word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x")) {
            System.out.println(word.substring(1, word.length()-1));
        }else if(word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        }else if(word.toLowerCase().endsWith("x"))
            System.out.println(word.substring(0,word.length()-1));
        else{
            System.out.println(word);
        }
        /*
        String result=word;
        //if (word.substring(0,1).equalsIgnoreCase("x")){result=word.substring(1);}
        //if (word.substring(word.length()-1).equalsIgnoreCase("x")){result=word.substring(0,word.length()-1);}
        if (word.toLowerCase().startsWith("x")){result=word.substring(1);}
        if (word.toLowerCase().endsWith("x")){result=word.substring(0,word.length()-1);}
        System.out.println(result);}}

         */
    }
}
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string
without those 'x' or 'X' chars, otherwise print the string unchanged.
Example:
input: xHiX
output: Hi
input: apple
output: apple
 */