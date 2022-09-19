package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _005_030_Arrays_DoSwitch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
        Arrays.toString(do_switch(arr));
    }
    public static int[] do_switch(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr).replace(" ", ""));
        return arr;
    }
}

