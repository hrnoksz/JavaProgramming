package day19_LoopPractice;

public class _10_TheIndexNumberOfFirstUniqueChar {

    public static void main(String[] args) {

        String str = "aabbccdeeff";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch == each){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("The index number of the first unique character is: "+str.indexOf(ch));
                break;
            }
        }


    }
}
/*
Write a program that can return the index number of the first unique character.
 */