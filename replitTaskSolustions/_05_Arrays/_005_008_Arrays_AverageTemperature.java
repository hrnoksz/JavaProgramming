package _05_Arrays;

import java.util.Scanner;

public class _005_008_Arrays_AverageTemperature {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = new double[8];
        double sum = 0;
        for (int i = 0; i < temps.length; i++) {
            temps[i] = scan.nextDouble();
        }
        for (double each : temps) {
            sum += each;
        }
        System.out.println(sum/ temps.length);

    }
}
/*
Given an array temps with temperature values find and print the average value

Example:
input: 80 88 88 84 82 78 60 68
output: 78.5
 */