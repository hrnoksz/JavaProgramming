package _01_Variables;

import java.util.Scanner;

public class _1_005_Variables_CaffeinOverDose {

    public static void main(String[] args) {

        int mgInDrink;
        int lethalDose = 10;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        mgInDrink = scan.nextInt();

        System.out.println("It would take about " + (lethalDose * 100) /mgInDrink + " drinks for a lethal overdose.");


    }
}
/*
Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
Write a program with a variable that holds the number of mgs of caffeine in a drink and
outputs how many drinks it takes to kill a person.

In one gram, there is 1000 mg. Formula to get drink count to cause an overdose is

Flow: Enter number of milligrams in drink: It would take about # drinks for a lethal overdose.

10*1000 / numOfMilligrams
 */