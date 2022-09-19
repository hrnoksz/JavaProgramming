package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _005_029_Arrays_ShiftLeft {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if(i==0){
                array[size-1] = nums[0];
            }else{
                array[i-1] = nums[i];
            }
        }
        System.out.println(Arrays.toString(array));


    }
}
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
You may modify and print the given array, or print a new array.`

Example:

input: 6, 2, 5, 3

output: [2, 5, 3, 6]
 */