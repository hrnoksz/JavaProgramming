package day25_CustomMethod_Overloading;

import utilities.StringUtility;

import static utilities.StringUtility.reverse;

public class Test1 {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);

        System.out.println("-------------------------");

        String s1 = "Cydeo School";

        String reverse = reverse(s1);

        System.out.println(reverse); //loohcS oedyC

        System.out.println("----------------------------");

        String word = "Level";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome); // true

        System.out.println("--------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;
        for (String name : names) {
            if(StringUtility.isPalindrome(name)){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("---------------------------------");

        String str1 = "earth";
        String str2 = "heart";

        boolean isAnagram = StringUtility.anagram(str1, str2);
        System.out.println(isAnagram); // true

        System.out.println("-----------------------------");

        String str3 = "aaaaabbbbbccccc";
        String result = StringUtility.removeDuplicates(str3);
        System.out.println(result); //abc

        System.out.println("-----------------------------");

        String str4 = "aaabccdeee";
        String result1 = StringUtility.uniqueCharacter(str4);
        System.out.println(result1); // bd
    }

}
