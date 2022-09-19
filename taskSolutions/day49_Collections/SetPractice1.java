package day49_Collections;

import java.util.*;

public class SetPractice1 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr)); //we add array to set

        System.out.println("set1 = " + set1);

        arr = set1.toArray(new String[0]); //set convert to array

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------------");

        String[] arr1 = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(arr1));
        System.out.println("set2 = " + set2);
        arr1 = set2.toArray(new String[0]);
        System.out.println(Arrays.toString(arr1));
        //arr1 = new LinkedHashSet<>(Arrays.asList(arr1)).toArray(new String[0]);

        System.out.println("-----------------------------------------------");

        String[] arr2 = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};
        Set<String> set3 = new TreeSet<>(Arrays.asList(arr2));
        System.out.println("set3 = " + set3);
        arr2 = set3.toArray(new String[0]);
        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(new HashSet<>(list));//random order
        System.out.println("list = " + list);

        list = new ArrayList<>(new LinkedHashSet<>(list)); //insertion order
        System.out.println("list = " + list);

        list = new ArrayList<>(new TreeSet<>(list)); // ascending order from smaller to larger
        System.out.println("list = " + list);

        System.out.println("---------------------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        Set<String> chars = new LinkedHashSet<>();
        chars.addAll(Arrays.asList(array));
        System.out.println("chars = " + chars);

        array = chars.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------------------------");

        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Set<Integer> numbers = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println("numbers = " + numbers);
        nums = numbers.toArray(new Integer[0]); //numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(nums[4]); //5

        System.out.println("-----------------------------------------------");

        String str = "aaaabbbbccccdddeeeee";

        String result = "";//a4b4c4d3e5
/*
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);
                if(ch == ch1){
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }
            result += ch;
            result += count;

        }
        System.out.print(result);



 */
        String[] strArray = str.split("");

        Set<String> set5 = new LinkedHashSet<>(Arrays.asList(strArray));

        for (String each : set5) {
            int frequency = Collections.frequency(Arrays.asList(strArray), each);
            result += each + frequency;
        }
        System.out.println(result);
    }
}
