package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class removePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar",
                        "kayak", "reviver", "racecar", "madam")
        );

        // remove palindromes

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each = it.next();
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)) {
                it.remove();
            }
        }
        System.out.println(names); //[Java, Python, Cydeo, Car]

        System.out.println("=============================================");

        List<String> names1 = new ArrayList<>();
        names1.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar",
                        "kayak", "reviver", "racecar", "madam")
        );
/*
        Predicate<String> palindrome = str -> {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        };
        names1.removeIf(palindrome);

        System.out.println(names1);//[Java, Python, Cydeo, Car]

 */
        names1.removeIf(str-> {String reverse = "";
            for (int i = str.length()-1; i >=0 ; i--) {
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);}
        );

        System.out.println(names1); //[Java, Python, Cydeo, Car]


    }
}
