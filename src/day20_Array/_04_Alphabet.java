package day20_Array;

import java.util.Arrays;

public class _04_Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26]; // Z~~A
        /*
                  i     ch
        alphabets[0] = 'Z'; // 90 ASCII TABLE
        alphabets[1] = 'Y'; // 89
        alphabets[2] = 'X'; // 88
         */
       //Solution 1:
        char ch = 'Z';
        for (int i = 0; i < alphabets.length ; i++) {
            alphabets[i] = ch;
            ch--;
        }
        System.out.println(Arrays.toString(alphabets)); // print the whole array
        System.out.println(alphabets[0]); // printing the element of array

        System.out.println("----------------------------------------------");
        //solution 2:

        for (char i = 0, j = 'Z'; i < alphabets.length ; i++, j--) { // Here we can use ONLY TWO semicolon (;)
            alphabets[i] = j;
        }
        System.out.println(Arrays.toString(alphabets));


    }
}
