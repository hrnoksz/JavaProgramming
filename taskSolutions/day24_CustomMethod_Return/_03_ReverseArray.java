package day24_CustomMethod_Return;

import java.util.Arrays;

public class _03_ReverseArray {

    public static void main(String[] args) {

        int[] reverse = reverse(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(reverse)); //[5, 4, 3, 2, 1]
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }
}


/*
4. create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
 */