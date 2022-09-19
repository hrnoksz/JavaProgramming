package week10;

import java.util.Arrays;

public class _02_DifferenceMaxAndMin {

    public static void main(String[] args) {

    int[] array = {1,2,3,4,5};
    System.out.println((differenceMaxAndMin(array)));

    }
    public static int differenceMaxAndMin(int[] array){
        int max = array[0];
        int min = array[0];

        for (int each : array) {
            if(each> max){
                max = each;
            }
        }
        for (int each : array) {
            if(each<min){
                min = each;
            }
        }
        return max-min;
    }
}
