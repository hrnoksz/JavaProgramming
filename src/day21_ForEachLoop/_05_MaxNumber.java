package day21_ForEachLoop;

public class _05_MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) { // if there is element in the array that's greater than the current max number
                max = numbers[i]; // assigning great number to variable max
            }
        }
        System.out.println(max);

        System.out.println("--------------------------------------");
        int max1 =  numbers[0];
        for (int number : numbers) {
            if(number > max1){
                max1 = number;
            }
        }
        System.out.println(max1);
    }
}
