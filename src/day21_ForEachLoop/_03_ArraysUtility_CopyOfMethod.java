package day21_ForEachLoop;

import java.util.Arrays;

public class _03_ArraysUtility_CopyOfMethod {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3); // starting first element

        System.out.println(Arrays.toString(earlyBirds)); //[Elif, Sinem, Gunay]

        System.out.println("-------------------------------");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

        System.out.println("--------------------------------------------");

        // copyOfRange method()

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        //             0    1    2    3    4    5    6    7    8
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);
        System.out.println(Arrays.toString(ch2)); // [C, D, E, F] ===> ending index is excluded like substring method()

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // index:        0   1   2   3   4   5   6   7   8    9
        int[] result = Arrays.copyOfRange(scores, 3, 7);
        System.out.println(Arrays.toString(result)); //[40, 50, 60, 70]

        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(Arrays.toString(result2)); //[60, 70, 80, 90, 100]

    }
}
