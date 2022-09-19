package day22_MultiDimensionalArray;

import java.util.Arrays;

public class _06_ForeachLoop {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        for (int[] each1DArray  : arr2D){
            System.out.println(Arrays.toString(each1DArray));
        }
        System.out.println("--------------------------------------");

        for (int[] each1DArray  : arr2D){

            for (int eachElement : each1DArray){
                System.out.print(eachElement + " ");
            }
            System.out.println();
        }

    }
}
