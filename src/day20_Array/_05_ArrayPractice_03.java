package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _05_ArrayPractice_03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt(); // 5

        if(length <= 0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        int[] numbers = new int[length]; // [10, 20, 30, 40, 50] arrays needs to have enough capacity to contain
                                         // all the elements that user going to enter. Length means capacity of array

        for (int i = 0; i < length; i++) { // i: 0, 1, 2, 3, 4
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); // 10, 20.....50 // each input that is provided by user during each execution of the loop,
                                         // will be assigned to the indexes of the array
        }
        System.out.println(Arrays.toString(numbers));

        scan.close();


    }
}
