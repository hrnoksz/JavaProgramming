package day16_ForLoopStringPractice;

public class _04_UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";
        //            012345
        /*
        int lastB= str.lastIndexOf("B");
        System.out.println(lastB);// 2
        int firstB = str.indexOf("B");
        System.out.println(firstB); // 2
        System.out.println("-------------------------");
        int firstD = str.indexOf("D");
        System.out.println(firstD); // 5
        int lastD = str.lastIndexOf("D");
        System.out.println(lastD); // 5
        System.out.println("-----------------------------");
        int firstC = str.indexOf("C");
        System.out.println(firstC); // 3
        int lastC = str.lastIndexOf("CD");
        System.out.println(lastC); // 4
         */

        String result = "";
        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (starting from 0)
            char ch = str.charAt(i); // ch: each characters of str
            if(str.indexOf(ch) == str.lastIndexOf(ch)){ // if the first and last index numbers of the character are same,
                                                               // then it's unique
                result += ch;
            }
        }
        System.out.println(result);
    }
}
/*
3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

 */