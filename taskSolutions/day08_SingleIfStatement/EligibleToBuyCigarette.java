package day08_SingleIfStatement;

public class EligibleToBuyCigarette {

    public static void main(String[] args) {

        byte age = 19;

        boolean eligible = age >= 21;
        if (eligible) {
            System.out.println("Eligible to buy");
        }
        if (!eligible) {
            System.out.println("Not eligible to buy");
        }
    }
}
/*
Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */