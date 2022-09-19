package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsTest {

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5};

        String[] names = {"Java", "Selenium", "SQL", "API"};

        Generics.printEach(numbers);

        Generics.printEach(decimals);

        Generics.printEach(names);

        System.out.println("-------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(15, 20, 30, 40));

        Generics.printEach(scores);

        ArrayList<String> students = new ArrayList<>(Arrays.asList("Harun", "Oscar", "Muhtar"));

        Generics.printEach(students);

    }
}
