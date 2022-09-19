package day26_CustomMethodPractice;

import java.util.Arrays;

public class _04_RemoveElements2 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        numbers = removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] removeElement(int[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result[j++] = array[i];
            }
        }
        return result;
    }
}
