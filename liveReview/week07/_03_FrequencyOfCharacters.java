package week07;

public class _03_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // 'a'
            
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(c==str.charAt(j)){
                    count++;
                }
            }
            // if I already have that particular char in the bucket, don't execute following codes
            if(result.contains(""+c)){
                continue;
            }
            result+=c;
            result+=count;
        }
        System.out.println(result);
    }
}
/*
What is pseudocode?
-Iterate over given string with an outer loop so that you can get each char
-I need an inner loop to iterate again to compare that particular char with the rest of the string
--Empty bucket: this will hold each char and its frequency
 */