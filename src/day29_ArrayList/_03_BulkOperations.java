package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_BulkOperations {

    public static void main(String[] args) {

        //addAll(CollectionType) : adds collection of values to the ArrayList
        //removeAll(CollectionType): removes all the matching elements from the ArrayList
        //retainAll(CollectionType): removes all the non-matching elements from the ArrayList
        //containsAll(CollectionType): checks if all the elements are contained in the ArrayList

        //Arrays:
        //asList(array of values)==>returns the array as CollectionType

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,5,5,8,8,8));
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list); //[1, 2, 4, 6, 7, 9, 10]

        System.out.println("-------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));

        numbers.retainAll(Arrays.asList(100, 200, 300));
        System.out.println(numbers); //[100, 200, 300, 100, 200, 300]

        System.out.println("--------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles); //[QA, SDET, QA, SDET]

        System.out.println("--------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

        boolean r4 = nums.containsAll(Arrays.asList(2,5,10,1000));

        System.out.println("r1 = " + r1); // true
        System.out.println("r2 = " + r2); // true
        System.out.println("r3 = " + r3); // true
        System.out.println("r4 = " + r4); // false

        System.out.println("-----------------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println(nameList); //[Josh, Jack, Daniel, Shay, Breanna]

        System.out.println("-------------------------------------------");

        Integer[] numbers1 = {1,2,3,4};
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(numbers1));
        System.out.println(list4);



/*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);

 */

        System.out.println("--------------------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); if the array is primitive type, you cannot
        // convert array to ArrayList, but if we have Integer[] array then we can convert it.

        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array));
        System.out.println(list2); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3); //list3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
          list.add(each);
        }
        return list;
    }
}
