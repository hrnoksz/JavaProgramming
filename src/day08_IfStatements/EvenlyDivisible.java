package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

            int num = 100;
            boolean divisibleBy2 = num % 2 == 0; // if the remainder of a number divided by 2 is zero,
                                                 // then it's evenly divisible by 2.
            boolean divisibleBy3 = num % 3 == 0;
            boolean divisibleBy5 = num % 5 == 0;

        System.out.println(num + " is divisible by 2: " + divisibleBy2);
        System.out.println(num + " is divisible by 3: " + divisibleBy3);
        System.out.println(num + " is divisible by 5: " + divisibleBy5);

    }
}
/*
Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */