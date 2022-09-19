package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
        boolean result1 = isPalindrome.test("Java");
        System.out.println(result1); //false

        System.out.println("==============================");

        Predicate<Integer> isEven = p -> p %2 ==0;
        boolean result2= isEven.test(4);
        System.out.println(result2); //true

        System.out.println("================================");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));
        //list.removeIf(p -> p%2==0); // or
        list.removeIf(isEven);
        System.out.println(list); //[1, 3, 5, 7, 1, 3, 5, 7, 1, 3]

        System.out.println("==========================================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));
        names.removeIf(isPalindrome);
        System.out.println(names); //[Java, Python]

        System.out.println("=======================================================");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));

            }
        };
        printEach.accept("Java");

        System.out.println("==============================================================");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));
        /*
        for (Integer each : list1) {
            if(each %2 !=0){
                System.out.println(each);
            }
        }
         */
        list1.forEach(p-> {if(p%2 != 0) System.out.println(p);});

        System.out.println("===================================");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));
        employees.forEach(s -> {
            System.out.println(s.charAt(0)+"."+s.charAt(s.lastIndexOf(" ")+1));
        });

        System.out.println("========================================");

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] array = {1,2,3,4,5,6,7,8,9};
        List<Integer> list2 = convertToList.apply(array);
        System.out.println(list2); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("================================================");

        Function<List<Integer>, int[]> convertToArray = (l) -> {
            int[] arr = new int[l.size()];
            int i = 0;
            for (Integer each : l) {
                arr[i] = each;
                i++;
            }
            return arr;
        };
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,5,7,9));
        int[] arr = convertToArray.apply(list3);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 5, 7, 9]

        System.out.println("===================================================");

        // create a function that can return the maximum number from an int array

        // create a function that can swap the first and last elements of an array

        // Create a function that can reverse an array and returns it

        // create a function that can reverse a List



    }


}
