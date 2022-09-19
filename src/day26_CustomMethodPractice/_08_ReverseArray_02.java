package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class _08_ReverseArray_02 {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40};
        array = reverse(array);
        System.out.println(Arrays.toString(array)); // [40, 30, 20, 10]


    }
    public static int[] reverse(int[] array){
       int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }
}
