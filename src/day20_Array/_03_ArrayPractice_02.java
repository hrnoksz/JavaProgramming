package day20_Array;

import java.util.Arrays;

public class _03_ArrayPractice_02 {

    public static void main(String[] args) {

        char[] letters = new char[26];
        //letters[0] = 'A';
        //letters[1] = 'B';

        //Solution 1;
        for (char i = 'A', j= 0; i <= 'Z' && j <letters.length ; i++, j++) {
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("-------------------------------------------------");

        //Solution 2:
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++) {
            letters[i] = (char) j;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("-------------------------------------------------");

        //Solution 3:
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters));



    }
}
