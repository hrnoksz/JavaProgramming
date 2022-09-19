package day22_MultiDimensionalArray;

public class _02_ReverseTwoDimensionalArray {

    public static void main(String[] args) {

        int[][] array2D = { {1,2,3}, {4,5,6}};

        for (int i = array2D.length - 1; i >= 0; i--) {
            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
1. Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};
		output:
			reverse = { {6,5,4}, {3,2,1},};
 */