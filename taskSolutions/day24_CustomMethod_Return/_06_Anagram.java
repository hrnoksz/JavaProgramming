package day24_CustomMethod_Return;

import java.util.Arrays;

public class _06_Anagram {

    public static void main(String[] args) {

        String str1 = "cba";
        String str2 = "bac";
        System.out.println(isAnagram(str1, str2));
    }
    public static boolean isAnagram(String str1, String str2){
        boolean isAnagram = false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            isAnagram = true;
        }
        return isAnagram;
    }

}
/*
 2. create a method named isAnagram that passes two String parameters,
    the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */