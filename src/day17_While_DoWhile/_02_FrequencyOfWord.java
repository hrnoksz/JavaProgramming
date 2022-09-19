package day17_While_DoWhile;

public class _02_FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJava"; // indexes of str: 0 1 2 3 4 5 6 7
        // length of str : 8
        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) { //i: 0 1 2 3 we abstract from str.length() by 4
            String eachSub = str.substring(i, i+4); // we create all the possible substring which has four character
                                                    // we use (i, i+4), because java has 4 characters.
            if(eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println(frequency);




    }
}
/*
2. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)

 */