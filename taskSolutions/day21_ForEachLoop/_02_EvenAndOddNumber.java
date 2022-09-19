package day21_ForEachLoop;

public class _02_EvenAndOddNumber {

    public static void main(String[] args) {

            int[] numbers = {2, 4, 6, 8, 1, 3, 5, 7, 9};

            int countEven = 0,
                    countOdd = 0;

        for (int number : numbers) {
            if(number%2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("countEven = " + countEven); // 4
        System.out.println("countOdd = " + countOdd);   // 5
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */