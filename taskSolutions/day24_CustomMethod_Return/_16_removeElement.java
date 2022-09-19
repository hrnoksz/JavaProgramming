package day24_CustomMethod_Return;

import java.util.Arrays;

public class _16_removeElement {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;
        System.out.println(Arrays.toString(removeElement(array, index)));

    }
    public  static int[] removeElement(int[] array, int index){

         if(index < 0 || index > array.length-1){
             System.out.println("Invalid index: " + index);
             System.exit(0);
         }
        int[] newArr = new int[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
          if(i == index){
              continue;
          }
          newArr[j] = array[i];
          j++;
        }
        return newArr;
    }
}
/*
0. create a method named removeElement that passes one integer array and one integer,
	the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */