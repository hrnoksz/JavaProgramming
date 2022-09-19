package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEach(arr1);
        System.out.println("------------------------");
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        ArraysUtility.printEach(arr2);
        System.out.println("------------------------");
        char[] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEach(arr3);
        System.out.println("-----------------------");
        String[] names = {"Muhtar", "Oscar", "Sally"};
        ArraysUtility.printEach(names);

        System.out.println("--------------------------");
        int[] numbers = {-2, 11, 32, 3, 45};
        int max = ArraysUtility.maxNumber(numbers);
        System.out.println("max = " + max); //max = 45

        System.out.println("----------------------------");
        double[] array = {1.5, 2.5, 3.5, 4.5};
        double max1 = ArraysUtility.maxNumber(array);
        System.out.println("max1 = " + max1); //max1 = 4.5

        System.out.println("-----------------------------");

        int[] numbers1 = {1,2,3,4,5};
        int num = 8;
        boolean result = ArraysUtility.contains(numbers1,num);
        System.out.println("result = " + result); // false

        System.out.println("------------------------------------");
        String[] students = {"Harun", "Esra", "Enes"};
        String name = "Harun";
        boolean result1 = ArraysUtility.contains(students, name);
        System.out.println("result1 = " + result1); // true
    }
}
