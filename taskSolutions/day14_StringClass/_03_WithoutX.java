package day14_StringClass;

import java.util.Scanner;

public class _03_WithoutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        scan.close();
        char first = word.charAt(0);
        if (first == 'x') {
            //System.out.println(word.substring(1)); // or
            System.out.println(word.replaceFirst("x", ""));

        }
    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */