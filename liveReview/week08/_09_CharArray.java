package week08;

import java.util.Arrays;

public class _09_CharArray {

    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a',' ','i', 's',' ','f', 'u', 'n'};

        for (char letter : letters) {
            System.out.print(letter+" "); // j a v a   i s   f u n
        }
        System.out.println();

        String sentence = new String(letters);
        System.out.println("sentence = " + sentence); // sentence = java is fun

        String str = "abc";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars)); //[a, b, c]
    }
}
