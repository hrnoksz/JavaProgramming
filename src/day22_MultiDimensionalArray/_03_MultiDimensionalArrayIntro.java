package day22_MultiDimensionalArray;

import java.util.Arrays;

public class _03_MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

        String[][] groups = new String[3][]; // index: 0, 1, 2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        //System.out.println(Arrays.toString(groups)); //hashcode--> because toString() method is for single dimensional arrays only

        System.out.println(Arrays.deepToString(groups)); //[[Jon, Joes, James], [Aaron, Shay, Breanna], [Cassandra, Tahir, Aygun]]

        System.out.println("----------------------------------------------------");
        /*
            {1,2,3}
            {4,5,6,7}
            {8,9,10,11,12}
         */
        // index of the elements:
        //                0 1 2    0 1 2 3    0 1  2  3  4
        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
      //  index:             0         1            2

        System.out.println(Arrays.deepToString(arr2D)); //[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

        // {4, 5, 6, 7}
        System.out.println(Arrays.toString(arr2D[0])); // [1, 2, 3]
        System.out.println(Arrays.toString(arr2D[1])); // [4, 5, 6, 7]
        System.out.println(Arrays.toString(arr2D[2])); // [8, 9, 10, 11, 12]
        System.out.println(arr2D[1][0]); // 4
        System.out.println(arr2D[1][1]); // 5
        System.out.println(arr2D[1][2]); // 6
        System.out.println(arr2D[1][3]); // 7

        // 11
        System.out.println(arr2D[2][3]); // 11

    }
}
