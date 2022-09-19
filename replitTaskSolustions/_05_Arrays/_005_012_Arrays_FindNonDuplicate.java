package _05_Arrays;

import java.util.Scanner;

public class _005_012_Arrays_FindNonDuplicate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt()};
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int each : nums){
                if(nums[i] == each){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(nums[i]);
            }
        }



    }
}
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */