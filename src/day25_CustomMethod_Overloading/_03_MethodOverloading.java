package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class _03_MethodOverloading {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray); // sort method() is overload method. Because ıt has similar function with different parameters

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("----------------------------------");
        // sum of 10 and 20
        int sum1 = sumNumbers(10, 20);
        // sum of 10,20 and 30
        int sum2 = sumNumbers(10,20,30);

        // sum of 18.2 and 30.7
        double sum3 = sumOfNumbers(18.2, 30.7);

        // sum of 5.5, 4.5 and 6.5
        double sum4 = sumOfNumbers(5.5, 4.5, 6.5);
    }

    public static int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }
    public static int sumNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1+num2+num3;
    }
    public static int sumNumbers(int num1, int num2, int num3, int num4) {
        return sumNumbers(num1, num2, num3)+num4;
    }
    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return sumOfNumbers(num1, num2, num3)+num4;
    }
}
