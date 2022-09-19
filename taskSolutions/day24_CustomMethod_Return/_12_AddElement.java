package day24_CustomMethod_Return;

import java.util.Arrays;

public class _12_AddElement {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        int element = 4;
        int[] newArr = addElement(array,element);
        System.out.println(Arrays.toString(newArr));

    }
    public static int[] addElement(int[] array, int element){
        int[] newArr = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
            newArr[newArr.length-1] = element;
        }
        return newArr;
    }
}
/*
6. create a method named addElement that takes one integer array and one integer,
    the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

 */