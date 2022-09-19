package day24_CustomMethod_Return;

import java.util.Arrays;

public class _14_ReverseArray {

    public static void main(String[] args) {

        int[] reverse = reverse(new int[]{10, 20, 30, 40});
        System.out.println(Arrays.toString(reverse)); // [40, 30, 20, 10]

    }
    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }
}
/*
8. Create method named reverse that passes an integer array parameter,
	the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */