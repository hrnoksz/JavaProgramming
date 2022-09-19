package day21_ForEachLoop;

import java.util.Arrays;

public class _02_ArraysUtility_EqualsMethod {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1,arr2); // If all the values that represent the elements' index number of arrays are equal,
                                  // it returns TRUE, otherwise FALSE
        System.out.println(r1); //false

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2); // true

        System.out.println("-------------------------------------------------");
        //"acb", "bac ==> ANAGRAM==> heart-->earth ==> each of two words is built by same letters
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram); // true





    }
}
