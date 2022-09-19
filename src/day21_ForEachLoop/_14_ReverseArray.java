package day21_ForEachLoop;

import java.util.Arrays;

public class _14_ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        int[] reverse = new int[numbers.length];

       //       j            i
        reverse[0] = numbers[3];
        reverse[1] = numbers[2];
        reverse[2] = numbers[1];
        reverse[3] = numbers[0];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--,j++) {
            reverse[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reverse)); //[40, 30, 20, 10]


    }
}
