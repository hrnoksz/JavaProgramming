package day26_CustomMethodPractice;

import java.util.Arrays;

public class _07_ReverseArray {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40};
        array = reverse(array);
        System.out.println(Arrays.toString(array)); // [40, 30, 20, 10]
    }
    // reverses given the array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given the array, returns a new array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given the array, returns a new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses given the array, returns a new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }
}
