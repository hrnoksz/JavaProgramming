package _05_Arrays;

import java.util.Scanner;

public class _005_013_Arrays_FindMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];
        for (int num : nums) {
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);


    }
}
/*
Given an array num, get the max number in the array and print it out to the console.

nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33
 */