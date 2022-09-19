package day24_CustomMethod_Return;

public class _01_MaxNumberOfArray {

    public static void main(String[] args) {

        int max = maxNumber(new int[]{1,2,3,4,11,24,45});
        System.out.println(max);

    }
    public static int maxNumber(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
/*
2. create a method that can return the maximum number from an array of integers
 */