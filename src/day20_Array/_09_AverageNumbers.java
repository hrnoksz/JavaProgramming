package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _09_AverageNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int length = scan.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number");
            numbers[i] = scan.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averageNumber = sum / length;
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Average number: " + averageNumber);

        scan.close();
    }
}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */