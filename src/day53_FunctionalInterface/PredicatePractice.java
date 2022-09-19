package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {

        Predicate<Integer> isEven = p -> p %2 == 0;

        boolean r1 = isEven.test(100); // returns boolean

        System.out.println(r1);

        System.out.println("----------------------------------------");

        Predicate<String> isPalindrome = str -> {
            String reverse = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                reverse += str.charAt(i);
            }
            return str.equalsIgnoreCase(reverse);
        };

        boolean r2 = isPalindrome.test("Anna"); //returns boolean
        System.out.println(r2); //true

        System.out.println("-----------------------------------------------");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,1,1,2,2,3,3,4,4,5,5,6,6,7,7));

        Predicate<Integer> isEven1 = p -> p %2 == 0;

        list.removeIf(isEven1);

        System.out.println(list); //[1, 1, 3, 3, 5, 5, 7, 7, 1, 1, 3, 3, 5, 5, 7, 7]

        System.out.println("-------------------------------------------------------------");

        List<String> countries = new ArrayList<>(Arrays.asList("Germany", "Turkey", "Tunisia", "Tajikistan"));

        //Predicate<String> startsWithT = p -> p.startsWith("T");

        countries.removeIf(p->p.startsWith("T"));

        System.out.println(countries); //[Germany]


    }
}
