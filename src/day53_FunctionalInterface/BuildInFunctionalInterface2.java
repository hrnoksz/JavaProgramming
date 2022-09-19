package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {

        //BiPredicate
        // Create a function that can check if the Integer is contained in an array of Integer, return boolean
        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if(each == b){
                    result = true;
                    break;
                }
            }
            return result;
        };
        Integer[] arr = {1,2,3,4,5,6,7};
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1); //false

        System.out.println("============================================================");

        //Create a function that can check if two strings are anagram
        BiPredicate<String, String> anagram = (a, b) -> {
            char[] char1 = a.toCharArray();
            Arrays.sort(char1);
            char[] char2 = b.toCharArray();
            Arrays.sort(char2);
            return (Arrays.equals(char1, char2));
        };

        boolean r2 = anagram.test("earth", "heart");
        System.out.println(r2);

        System.out.println("============================================================");

        //BiConsumer
        //Create a function that can print the given string for given number of times
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Harun", 3);

        System.out.println("----------------------------------------------------------");

        //Create a function that takes first and last names and prints the formatted full name
        BiConsumer<String, String> fullName = (f, l) -> {
            System.out.println(f.toUpperCase().charAt(0) + f.substring(1).toLowerCase()+" "
                    +l.toUpperCase().charAt(0)+l.substring(1).toLowerCase());
        };
        fullName.accept("jAVa", "pROGramming"); //Java Programming

        System.out.println("_____________________________________________________");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " " + v);
        }

        scrumTeam1.forEach((k, v) -> System.out.println(k + " " + v));

        // both of them is same function

        System.out.println("============================================================");
        //BiFunction
        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> a > b ? a : b;
        int max = maxNum.apply(15, 45);
        System.out.println(max);

        System.out.println("_____________________________________________________");

        //2. create a function that can merge two integer arrays into a list
        BiFunction<Integer[], Integer[], List> merge = (a, b) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer each : a) {
                result.add(each);
            }
            for (Integer each : b) {
                result.add(each);
            }
            return result;
        };
        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {4,5,6};
        List<Integer> numbers = merge.apply(arr1,arr2);
        System.out.println(numbers);

        System.out.println("_____________________________________________________");

        // 3. create a function that takes a  list of String and a list of Integer and merge them into a students

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> mergeTwoList = (x, y) -> {
            Map<String, Integer> result = new LinkedHashMap<>();
            for (int i = 0; i < x.size(); i++) {
                result.put(x.get(i), y.get(i));
            }
            return result;
        };

        List<String> list1 = new ArrayList<>(Arrays.asList("Harun", "Aysen", "Oscar"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(100, 95, 90));
        Map<String, Integer> students = mergeTwoList.apply(list1, list2);
        System.out.println(students);

    }
}
