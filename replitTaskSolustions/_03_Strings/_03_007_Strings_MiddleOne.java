package _03_Strings;

import java.util.Scanner;

public class _03_007_Strings_MiddleOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        int length = word.length();
        int middle = length / 2;

        if (length % 2 != 0) {
            if (length == 3 || length > 3) {
                System.out.println(word.charAt(middle));
            }else{
                System.out.println(word.repeat(3));
            }
        }else{
            if(length == 4 || length > 4){
                System.out.println(word.substring(middle-1, middle+1));
            }else{
                System.out.println(word.repeat(2));
            }
        }
    }
}
/*
You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */