package week08;

import java.util.Arrays;

public class _08_ArraysUtilityExamples {

    public static void main(String[] args) {

        int[] nums = {5, 10, 4, 1000, 35};

        // Arrays utility class created by Java developers an d it has some useful methods that we can use

        Arrays.sort(nums); // sorting your elements from smaller to larger
        System.out.println(Arrays.toString(nums)); //[4, 5, 10, 35, 1000]

        // Arrays.equals() is used to check if two arrays' contents are equal
        int[] numsTwo = {4, 5, 10, 35, 1000};

        int[] numsThree = nums; // creating a new reference for the same the object

        System.out.println(Arrays.equals(nums, numsTwo)); // true

        System.out.println(nums == numsTwo); // false checking if the object is equal

        System.out.println(nums == numsThree); // true, because creating a new reference for the same the object
        System.out.println(Arrays.equals(nums, numsThree)); // true

        // copy of methof

        int[] numsFour = Arrays.copyOf(nums, 2);
        System.out.println(Arrays.toString(numsFour)); // [4, 5]


    }
}
