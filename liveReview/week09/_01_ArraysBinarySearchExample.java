package week09;

import java.util.Arrays;

public class _01_ArraysBinarySearchExample {

    public static void main(String[] args) {

        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421}; // 25: 0, 1, 2, -(2+1)

        int indexOne = Arrays.binarySearch(nums, 23); // this statement returns index of 23

        System.out.println("indexOne = " + indexOne); // 1

        System.out.println(Arrays.binarySearch(nums, 2344)); // 4

        System.out.println(Arrays.binarySearch(nums,25)); // -3

        System.out.println(Arrays.binarySearch(nums, 700)); // -5

        if(Arrays.binarySearch(nums, 12345)>=0){ // Like a contains method
            System.out.println("12345 is present in array"); // this block will be executed
        }else{
            System.out.println("12345 is not in the list");
        }

        int[] numsTwo = {56, 3, -67, 100, 1000, 75};

        Arrays.sort(numsTwo); // in order to use binarySearch method, it needs to be sorted first

        System.out.println(Arrays.binarySearch(numsTwo, 60)); // -4
    }
}
