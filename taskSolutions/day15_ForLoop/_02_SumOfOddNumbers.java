package day15_ForLoop;

public class _02_SumOfOddNumbers {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("sum = " + sum);


    }
}
/*
2. Write a program that can return the sum of odd numbers between 1 to 100
 */