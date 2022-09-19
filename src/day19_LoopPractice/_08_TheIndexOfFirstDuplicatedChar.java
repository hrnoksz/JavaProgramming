package day19_LoopPractice;

public class _08_TheIndexOfFirstDuplicatedChar {

    public static void main(String[] args) {

        String str = "abcddeef";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch == each){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("The index number of the first duplicated character is: " + i);
                break;
            }
        }

    }
}
/*
Write a program that cna return the index number of the first duplicated character from a string
 */