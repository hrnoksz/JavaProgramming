package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class _03_MinNumber {

    public static void main(String[] args) {

    }
    //1. create a method that can return the min number from an integer array
    public static int min(int[] numbers){
        int min = numbers[0];
        for (int each : numbers) {
            if(each<min){
                min = each;
            }
        }
        return min;
    }

    //2. create a method that can return the min number from double array
    public  static double min(double[] numbers){
        double min = numbers[0];
        for (double each : numbers) {
            if(each<min){
                min = each;
            }
        }
        return  min;
    }

    //3. create a method that can return the min number from long array
    public  static long min(long[] numbers){
       long min = numbers[0];
        for (long each : numbers) {
            if(each<min){
                min = each
;            }
        }
        return  min;
    }

    //4. create a method that can return the min number from short array
    public  static short min(short[] numbers){
        short min = numbers[0];
        for (short each : numbers) {
            if(each<min){
                min = each;
            }
        }
        return  min;
    }

    //5. create a method that can return the min number from float array
    public  static float min(float[] numbers){
        float min = numbers[0];
        for (float each : numbers) {
            if(each<min){
                min = each;
            }
        }
        return min;
    }

    //6. create a method that can return the min number from byte array
    public  static byte min(byte[] numbers){
        byte min = numbers[0];
        for (byte each : numbers) {
            if(each<min){
                min = each;
            }
        }
        return min;
    }
}
