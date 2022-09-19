package day23_CustomMethods_Void;

import java.util.Arrays;

public class _14_EachElement {

    public static void main(String[] args) {

        printEachElement(new int[]{1,2,3});
    }

    public static void printEachElement(int[] numbers){
        for (int each : numbers) {
            System.out.println(each+" ");
        }
    }
}
/*
14. create a method named printEachElement that can print each elements of an integer array
 */