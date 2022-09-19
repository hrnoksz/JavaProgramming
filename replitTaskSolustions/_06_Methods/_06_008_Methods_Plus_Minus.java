package _06_Methods;

import java.util.Scanner;

public class _06_008_Methods_Plus_Minus {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++) {
            arr[i]=inp.nextInt();
        }
        plus_minus(arr);
    }
    public static void plus_minus(int[] array){
        int countOfPositive = 0;
        int countOfNegative = 0;
        int countOfZero = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] >0){
                countOfPositive++;
            }else if(array[i]<0){
                countOfNegative++;
            }else{
                countOfZero++;
            }
        }
        System.out.println("positives:" + countOfPositive +", negatives:" + countOfNegative +", zeros:" + countOfZero);

    }
}
/*
Create a method called plus_minus that gets an array of ints (int[]),
it outputs how many negative , positive and zero numbers are in the array.

Example:

plus_minus (new int[]{1,2,55,-9,-2,0});

output:
positives:3, negatives:2, zeros:1
 */