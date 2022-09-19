package week10;

import java.util.Arrays;

public class _01_CountOfEven {

    public static void main(String[] args) {


        int[] array ={2,4,5,3,8,9};
        System.out.println(counter(array)); // 3


    }
    public static int counter(int[] array){
        int count = 0;
        for (int each : array) {
            if(each%2 == 0){
                count++;
            }
        }
        return count;
    }
}
