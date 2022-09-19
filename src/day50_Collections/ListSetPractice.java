package day50_Collections;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set); //[1, 2, 3, 4, 5]

        // we can set convert both array and List
        Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>(set);

        System.out.println(list); //[1, 2, 3, 4, 5]

        List<String> names = null;

        //System.out.println(names.size()); //NullPointerException

        System.out.println("----------------------------------");

        List<Character> chars = new Stack<>();

        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars); //[A, B, C, D]

        ((Stack) chars).pop(); //pop()---> LIFO

        System.out.println("chars = " + chars); //[A, B, C]

        //poll()-->FIF0 ==>PriorityQueue, ArrayDeque, LinkedList

        List<String> names1 = new LinkedList<>();

        names1.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names1); //[James, Jimmy, Kathy, Breanna, Max]

        ((LinkedList<String>) names1).poll();

        System.out.println(names1); //[Jimmy, Kathy, Breanna, Max]

        ((LinkedList<String>) names1).poll();

        System.out.println(names1); //[Kathy, Breanna, Max]


    }
}
