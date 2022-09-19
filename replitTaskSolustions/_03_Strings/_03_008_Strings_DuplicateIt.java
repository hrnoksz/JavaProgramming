package _03_Strings;

import java.util.Scanner;

public class _03_008_Strings_DuplicateIt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();
        System.out.println(""+word1+word2.repeat(2)+word1);



    }
}
/*
You have 2 words
Print the first word, second word, second word, first word
Input:
one
two
Output:
onetwotwoone
 */