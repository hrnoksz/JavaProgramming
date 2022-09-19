package week05;

import java.util.Scanner;

public class ReverseUsingCharATMethod {

    public static void main(String[] args) {

        // what is palindrome? "madam" when you reverse : "madam" again
        // check for 5 characters word, and without methods that we did not learn

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        scan.close();
        String reverseWord = "";
        reverseWord +=word.charAt(4);
        reverseWord +=word.charAt(3);
        reverseWord +=word.charAt(2);
        reverseWord +=word.charAt(1);
        reverseWord +=word.charAt(0);
        String result = "";

        if(word.equals(reverseWord)){
            result = word + " is palindrome";
        }else{
            result = word + " is not palindrome";
        }
        System.out.println(result);

    }
}
/*

 */