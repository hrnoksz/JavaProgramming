package day23_CustomMethods_Void;

import java.util.Arrays;

public class _17_Anagram {

    public static void main(String[] args) {

        anagram("silent", "listen");
        System.out.println("-----------------------");
        anagram1("earth", "heart");
    }
    public static void anagram(String str1, String str2){

        String[] arr1  = str1.split("");
        Arrays.sort(arr1);
        String[] arr2 = str2.split("");
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println(str1 + " and " + str2 + " are anagram");
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }

    public static void anagram1(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
/*
17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */
