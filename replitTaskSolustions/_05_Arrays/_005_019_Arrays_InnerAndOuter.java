package _05_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class _005_019_Arrays_InnerAndOuter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        int count = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if(inner[i] == outer[j]){
                  count++;
                  break;
                }

            }

        }
        System.out.println(count == sizeInner);





    }
}
/*
Given two arrays of ints sorted in increasing order, outer and inner,
print out true if all of the numbers in inner appear in outer.
Take advantage of the fact that both arrays are already in sorted order.

Examples:

input (outer): 1, 2, 4, 6
input (inner): 2, 4
output: true

input (outer):` 1, 2, 4
input (inner): 6, 5
output: false
 */