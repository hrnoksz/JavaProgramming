package day19_LoopPractice;

public class _09_AllDuplicatedCharacters {

    public static void main(String[] args) {

        String str = "aabbccddeeff";
        String result = "";

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
                if(!result.contains(str.charAt(i)+"")){
                    result += str.charAt(i);
                }
            }
        }
        System.out.println(result);


    }
}
/*
Write a program that can display all the characters that appeared twice in the string.
 */