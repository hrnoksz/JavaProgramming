package day21_ForEachLoop;

import java.util.Arrays;

public class _01_ReverseOrder {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] reverse = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reverse)); //[9, 8, 7, 6, 5, 4, 3, 2, 1]



        System.out.println("------------------------------------------");

        String[] names = {"Harun", "Irem", "enes", "Emre", "ali"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); //[Emre, Harun, Irem, ali, enes]


    }
}
/*
1. Write a program that sort the array of integer in descending order
 */