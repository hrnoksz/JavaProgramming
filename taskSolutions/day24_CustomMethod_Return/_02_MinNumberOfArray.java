package day24_CustomMethod_Return;

public class _02_MinNumberOfArray {

    public static void main(String[] args) {

        int min = minNumber(new int[]{-5,0,4,11});
        System.out.println(min);
    }
    public static int minNumber(int[] array){

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
/*
3. create a method that can return the minimum number from an array of integers
 */