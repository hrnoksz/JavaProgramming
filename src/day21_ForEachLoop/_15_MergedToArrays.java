package day21_ForEachLoop;

import java.util.Arrays;

public class _15_MergedToArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        int[] merged = new int[arr1.length + arr2.length]; // merged two arrays

        int j = 0;
        for (int each : arr1) {
           merged[j++] = each;
        }
        for (int each : arr2) {
            merged[j++] = each;
        }
        System.out.println(Arrays.toString(merged)); //[1, 2, 3, 4, 5, 6]

        System.out.println("--------------------------------------");

        String[] group1 = {"Ali", "Layan", "Aysenur"}; // 3 elements
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; // 5 elements

        String[] students = new String[group1.length + group2.length]; // 8 elements

        int i = 0; // i: index number of students array which starts from ZERO
        for (String each : group1) {
            students[i++] = each;
        }
        for (String each : group2) {
            students[i++] = each;
        }
        System.out.println(Arrays.toString(students)); //[Ali, Layan, Aysenur, Maria, Aygun, Duygu, Suat, Valeriy]

        System.out.println("-----------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};
        char[] chars = new char[ch1.length + ch2.length];

        int k = 0;

        for (char each : ch1) {
            chars[k] = each;
            k++;
        }
        for (char each : ch2) {
            chars[k] = each;
            k++;
        }
        System.out.println(Arrays.toString(chars)); //[A, B, C, D, E, F, G, H]



    }
}
/*
1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */