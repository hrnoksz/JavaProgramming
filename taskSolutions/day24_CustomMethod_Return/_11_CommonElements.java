package day24_CustomMethod_Return;

import java.util.Arrays;

public class _11_CommonElements {

    public static void main(String[] args) {

        int[] commonElements = commonElements(new int[]{1,2,3,4,5}, new int[]{4,5,6,7,8});
        System.out.println(Arrays.toString(commonElements));
    }
    public static int[] commonElements(int[] arr1, int[] arr2){
        int[] commonElements = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                   commonElements[i] = arr1[i];
                }
            }
        }
        return commonElements;
    }
}
/*
3. Create a method named commonElements that find common elements of two int[] arrays
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
 */