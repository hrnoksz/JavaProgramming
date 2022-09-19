package day15_ForLoop;

public class _04_FactorialNumber {

    public static void main(String[] args) {

        double factorial = 1;
        for (int i = 1; i <=5 ; i++) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);

    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */