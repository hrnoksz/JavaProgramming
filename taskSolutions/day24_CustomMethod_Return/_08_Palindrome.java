package day24_CustomMethod_Return;

import static day24_CustomMethod_Return._07_ReverseOfWord.reverse;

public class _08_Palindrome {

    public static void main(String[] args) {
        String str = "level";
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        boolean isPalindrome = false;
        if(str.equalsIgnoreCase(reverse(str))){
            isPalindrome = true;
        }
    return isPalindrome;
    }
}
/*
4.  By using the reverse method above to create another method named isPalindrome
	that passes a String parameter, the method returns true if the string is palindrome,
	otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */