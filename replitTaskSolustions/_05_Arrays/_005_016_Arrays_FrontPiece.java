package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _005_016_Arrays_FrontPiece {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        for (int i = 0; i <size; i++) {
            if(size >=2){
                int[] arr1 = Arrays.copyOf(num,2);
                System.out.println(Arrays.toString(arr1));
                break;
            }else{
                int[] arr2 = Arrays.copyOf(num,1);
                System.out.println(Arrays.toString(arr2));
                break;
            }

        }

    }
}
/*
Given an int array num of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Examples:

input: 1, 2, 3
output: [1, 2]

input: 1
output: [1]

input: 4, 5, 4, 3, 8
output: [4, 5]
 */