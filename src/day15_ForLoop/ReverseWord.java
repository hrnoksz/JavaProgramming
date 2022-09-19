package day15_ForLoop;

public class ReverseWord {

    public static void main(String[] args) {

        String word = "Java";
        String reverseWord = "";

        for (int i = 3; i >=0 ; i--) {
            reverseWord += word.charAt(i);
        }
        System.out.print(reverseWord);

    }
}
/*
1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */