package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class _02_MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int max = max(numbers);
        System.out.println("max = " + max); // 5

        long[] numbers2 = {5,8,9,100,1001};
        long max1 = max(numbers2);
        System.out.println("max1 = " + max1); //1001

    }
    //1. create a method that can return the max number from an integer array
    public static int max(int[] numbers){
        int max = numbers[0];
        for (int each : numbers) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    //2. create a method that can return the max number from double array
    public static double max(double[] numbers){
        double max = numbers[0];
        for (double each : numbers) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    //3. create a method that can return the max number from long array
    public static long max(long[] numbers){
       long max = numbers[0];
        for (long each : numbers) {
            if(each>max){
                max = each;
            }
        }
        return  max;
    }

    //4. create a method that can return the max number from short array
    public  static short max(short[] numbers){
        short max = numbers[0];
        for (short each : numbers) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    //5. create a method that can return the max number from float array
    public static float max(float[] numbers){
        float max = numbers[0];
        for (float each : numbers) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    //6. create a method that can return the max number from byte array
    public static byte max(byte[] numbers){
        byte max = numbers[0];
        for (byte each : numbers) {
            if(each>max){
                max = each;
            }
        }
        return  max;
    }
}
