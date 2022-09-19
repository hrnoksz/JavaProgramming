package day21_ForEachLoop;

import java.util.Arrays;

public class _10_StringMethod_Split {

    public static void main(String[] args) {

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); //[Wooden, Spoon]

        System.out.println("----------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr)); //[WoodenSpoon, cydeo.com]

        String str = "ABC";
        String[] arr1 = str.split(""); // in order to split each character we use "" empty string
        System.out.println(Arrays.toString(arr1)); //[A, B, C]

        System.out.println("-----------------------------------------------");

        String s = "Today is nice day. Today is monday. Today we learn Java";
        String[] arr2 = s.split("\\. "); // in order to split any character with dot, then we use \\ before DOT
        System.out.println(Arrays.toString(arr2)); //[Today is nice day, Today is monday, Today we learn Java]
    }
}
