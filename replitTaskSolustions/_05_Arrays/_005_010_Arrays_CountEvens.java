package _05_Arrays;

import java.util.Scanner;

public class _005_010_Arrays_CountEvens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int countEven = 0;
        for (int each : nums) {
            if(each%2 == 0){
                countEven++;
            }
        }
        System.out.println(countEven);


    }
}
/*
Given an array nums, count and print the number of even numbers in the array

Examples:

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */