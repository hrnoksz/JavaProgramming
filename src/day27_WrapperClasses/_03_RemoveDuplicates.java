package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class _03_RemoveDuplicates {

    public static void main(String[] args) {

        int[] array = {10, 10, 10, 30, 40, 40, 50, 60};
        array = removeDuplicates(array);
        System.out.println(Arrays.toString(array)); //[10, 30, 40, 50, 60]

        System.out.println("---------------------------");

        String[] names = {"Muhtar", "Muhtar", "Harun", "Harun", "Oscar", "Oscar"};
        names = removeDuplicates(names);
        System.out.println(Arrays.toString(names)); //[Muhtar, Harun, Oscar]
    }
    // removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

}
