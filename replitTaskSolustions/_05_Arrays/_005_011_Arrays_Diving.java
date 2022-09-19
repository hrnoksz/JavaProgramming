package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _005_011_Arrays_Diving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge "+(i+1) +":");
            score[i] = input.nextFloat();
        }
        Arrays.sort(score);
        float[] score5 = Arrays.copyOfRange(score,1, score.length-1);
        float total = 0;

        for (float each : score5) {
            total += each;
        }
        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();
        total *= difficulty * 0.6;

        System.out.printf("Total: %.2f", total);
    }
}
/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.

The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.

The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.

Note: System.out.printf("Total: %.2f",total); is used to get rid of extra floating points. Do not make any change there.

Flow:

Accept the 7 scores from the judges
Accept the difficulty number
Display the final score
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
 */