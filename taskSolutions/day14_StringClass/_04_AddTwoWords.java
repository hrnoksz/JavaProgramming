package day14_StringClass;

import java.util.Scanner;

public class _04_AddTwoWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord = scan.next();
        System.out.println("Enter second word:");
        String secondWord = scan.next();
        scan.close();
        char l = firstWord.charAt(firstWord.length()-1);
        char f = secondWord.charAt(0);

        if(l == f){
            System.out.println(firstWord + secondWord.substring(1));
        }else{
            System.out.println(firstWord + secondWord);
        }

    }
}
/*
 4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */