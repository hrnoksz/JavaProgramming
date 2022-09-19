package day20_Array;

import java.util.Arrays;

public class _13_Numbers {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");

        for (int i = numbers.length-1; i >= 1; i--) {
            numbers[i] = i;
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }
}
/*
1. create an array that has the numbers 1 to 100
2. create an array that has the numbers 100 to 1
 */