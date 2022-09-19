package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _01_ArraysIntro {

    public static void main(String[] args) {

        // Size is fixed
        // ın order creating one dimensional array, we use [] brackets after the data type
        // or after the variable name. Both are possible.
        // String[] myGroup or String myGroup[]
        //create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5]; // index number 0 ~~ 4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        //myGroup[5] = "Muhtar"; out of exception because this string can contain only five elements
        //myGroup[-1] = "Adam"; out of exception because the minimum index is zero

        //System.out.println(myGroup); // hashcode

        System.out.println(Arrays.toString(myGroup)); //[null, null, null, null, null]
                                                      // null is default value of non-primitives data type
        System.out.println("---------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index            0          1          2             3          4          5          6
        System.out.println(Arrays.toString(days));

        int number = 5;
        if(number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]); // Friday



        System.out.println("----------------------------------");

        int[] scores = new int[4];
        System.out.println(Arrays.toString(scores)); // [0, 0, 0, 0]
                                                     // ZERO is default value of primitive (BYTE, SHORT, INT and LONG)
        System.out.println("----------------------------");

        double[] taxRate = new double[2];
        System.out.println(Arrays.toString(taxRate)); // [0.0, 0.0]
                                                      // 0.0 is default value for DOUBLE and FLOAT data types
    }
}
