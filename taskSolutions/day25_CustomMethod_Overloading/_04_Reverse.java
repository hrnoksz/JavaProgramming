package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class _04_Reverse {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reverse = reverse(array);
        System.out.println(Arrays.toString(reverse)); //[5, 4, 3, 2, 1]

        System.out.println("---------------------------------");
        String[] students = {"harun", "aysen", "sena"};
        String[] reverse1 = reverse(students);
        System.out.println(Arrays.toString(reverse1)); //[sena, aysen, harun]

    }
    //1. Create a method that can reverse an integer array
    public static int[] reverse(int[] arr){
        int[] revArray = new int[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            revArray[j] = arr[i];
        }
        return revArray;
    }

    //2. Create a method that can reverse a double array
    public static double[] reverse(double[] arr){
        double[] revArray = new double[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            revArray[j] = arr[i];
        }
        return revArray;
    }

    //3. Create a method that can reverse a char array
    public static char[] reverse(char[] arr){
        char[] revArray = new char[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            revArray[j] = arr[i];
        }
        return revArray;
    }

    //4. Create a method that can reverse a String array
    public static String[] reverse(String[] arr){
        String[] revArray = new String[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            revArray[j] = arr[i];
        }
        return revArray;
    }
}
