package week10;

public class _02_01_DifferenceMaxAndMin {

    public static void main(String[] args) {

        int[] arr = {4, 7, 10, 45, -34, 0, 12};
        System.out.println(difference(arr));

        System.out.println(_01_CountOfEven.counter(arr));
    }

    public static int difference(int[] arr) {
        int diff = 0;

        int max = Integer.MIN_VALUE; // int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        diff = max - min;
        return diff;
    }
}
