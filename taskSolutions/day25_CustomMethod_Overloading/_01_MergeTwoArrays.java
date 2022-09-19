package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class _01_MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        int[] arr = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5, 6]

        System.out.println("----------------------------------");
        String[] groups1 = {"harun", "aysen"};
        String[] groups2 = {"kasım", "burcu"};
        String[] groups = merge(groups1,groups2);
        System.out.println(Arrays.toString(groups)); //[harun, aysen, kasım, burcu]
    }
    //1. create a method that can merge two integer arrays.
    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            arr[i] = each;
            i++;
        }
        for (int each : arr2) {
            arr[i] = each;
            i++;
        }
        return arr;
    }

    //2. create a method that can merge two double arrays.
    public static double[] merge(double[] arr1, double[] arr2){
        double[] arr = new double[arr1.length + arr2.length];
        int i = 0;
        for (double each : arr1) {
            arr[i] = each;
            i++;
        }
        for (double each : arr2) {
            arr[i] = each;
            i++;
        }
        return arr;
    }

    //3. create a method that can merge two char arrays.
    public static char[] merge(char[] arr1, char[] arr2){
        char[] arr = new char[arr1.length+ arr2.length];
        int i = 0;
        for (char each : arr1) {
            arr[i] = each;
            i++;
        }
        for (char each : arr2) {
            arr[i] = each;
            i++;
        }
        return arr;
    }

    //4. create a method that can merge two String arrays.
    public static String[] merge(String[] arr1, String[] arr2){
        String[] arr = new String[arr1.length+ arr2.length];
        int i = 0;
        for (String each : arr1) {
            arr[i] = each;
            i++;
        }
        for (String each : arr2) {
            arr[i] = each;
            i++;
        }
        return arr;
    }
}
