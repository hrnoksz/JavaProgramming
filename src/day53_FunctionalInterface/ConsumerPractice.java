package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {

        Consumer<int[]> printEach = n -> {
            for (int each : n) {
                System.out.println(each);
            }
        };
        int[] numbers = {1,2,3,4,5};

        printEach.accept(numbers);

        System.out.println("--------------------------------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(str -> {
            System.out.println(str.charAt(0) + "." + str.charAt(str.lastIndexOf(" ")+1));
        });

    }


}
