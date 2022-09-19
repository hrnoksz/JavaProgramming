package day49_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr)); //We add the array to set

        arr = set1.toArray(new String[0]); //we can convert set to array
        // toArray() method comes from Collection type

        // arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]); We can convert like this

        System.out.println("set1 = " + set1); //set1 = [Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]
                                              // the order is very random

        System.out.println(Arrays.toString(arr));//[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]

        System.out.println("------------------------------------------");

        String[] arr1 = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};


        arr1 = new LinkedHashSet<>(Arrays.asList(arr1)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr1)); //[Wooden Spoon, Book, Pen, Phone, Milk, Eggs, Coke, Paper towels]
        //LinkedHashSet keeps the insertion order

        System.out.println("---------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        list = new ArrayList<>(new LinkedHashSet<>(list)); //[1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]

        System.out.println(list);

        System.out.println("---------------------------------------------");

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list1 = new ArrayList<>(new TreeSet<>(list1)); //[10, 20, 30, 40, 200, 300, 400, 500, 600, 1000]
        // it removes duplicates and sorts the elements from smaller to larger

        System.out.println(list1);

        System.out.println("------------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        Set<String> s = new LinkedHashSet<>();

        s.addAll(Arrays.asList(array));

        System.out.println(s); //[A, B, C]

        System.out.println("----------------------------------------------------");

        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println(nums[4]);

        System.out.println("----------------------------------------------------");
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        String str = "aaaabbbbccccdddeeeee";

        String result = ""; //a4b4c4d3e5

        String[] strArray = str.split("");

        for (String each : new LinkedHashSet<>(Arrays.asList(strArray))) {
            int count = Collections.frequency(Arrays.asList(strArray), each);
            result += each + count;
        }

        /*
         for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
             result += each + Collections.frequency(  Arrays.asList(str.split("")) ,  each);
        }
         */

        System.out.println(result); //a4b4c4d3e5

        System.out.println("-------------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println(names); //[Ahmet, John, James, Breanna, Shay]

        System.out.println(names.toArray(new String[0])[2]); // we convert set to array -->James

        System.out.println(new ArrayList<>(names).get(4)); // We convert set to ArrayList--> Shay

    }
}
