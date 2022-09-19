package day24_CustomMethod_Return;

import java.util.Arrays;

public class _04_MergedArrays {

    public static void main(String[] args) {

      int[] merge = merge(new int[]{1,2,3}, new int[]{4,5});
        System.out.println(Arrays.toString(merge)); //[1, 2, 3, 4, 5]
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] merge = new int[arr1.length + arr2.length];
        int i = 0;
        for (int element : arr1) {
            merge[i] = element;
            i++;
        }
        for (int element : arr2) {
            merge[i] = element;
            i++;
        }
        return merge;
    }

}



/*
5. create a method that can merge two arrays and return the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}

 */