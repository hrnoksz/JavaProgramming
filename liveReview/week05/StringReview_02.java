package week05;

import java.util.Locale;

public class StringReview_02 {

    public static void main(String[] args) {
        /*
        length(): it doesn't take parameter, it returns an integer number
         */

        String message = "EU8 is Awesome!!";
        int count = message.length();
        System.out.println("how many characters we have: " + count);

        System.out.println(count == 16); // true

        if(message.length()== 16){
            System.out.println("happy testing");
        }
        System.out.println("-------------------------");
        System.out.println(message.toUpperCase());
        System.out.println("message after uppercase");
        System.out.println(message); //EU8 is Awesome!! because string is immutable.

        // assign changes to a reference
        String messageTwo = message.toUpperCase();
        System.out.println(messageTwo); //EU8 İS AWESOME!!

        System.out.println("----------------------------------");
        String str = " abc ";
        str = str.trim();
        System.out.println(str); // abc
        System.out.println(str); //" abc "

        //can we also trim not the spaces before or after, but the one that is inside the text?
        String str2 = " abc cde ";
        str2 = str2.replaceAll(" ", "");
        System.out.println(str2); //abccde

        str2 = str2.replaceFirst(" ", "");
        System.out.println(str2); // abccde

        String str3 = " EU8 Awesome ";
        str3 = str3.trim().replaceFirst(" ", "");
        System.out.println(str3);//EU8Awesome

        //can we trim and replace and do upperCase and substring in the same expression  ??
        // string methods chaining: possible YES
        String str4 = " EU8 Awesome ";
        str4 = str4.trim().replaceFirst(" ", "").toUpperCase().substring(3);
        System.out.println(str4); //AWESOME



    }
}
