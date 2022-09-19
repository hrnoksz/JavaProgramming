package week06;

public class _02_Example {

    public static void main(String[] args) {

        for (int i = 3; i <=130 ; i++) {
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
/*
Write a program that displays all odd numbers between 3-130
in the same line
 */
        /*
        Write a program that displays the number of even numbers between 5 and 50 (included)
         */
        int countOfEven = 0;
        for (int i = 5; i <=50; i++) {
            if(i%2 == 0){
                countOfEven++;
            }
        }
        System.out.println(countOfEven);
    }
}
