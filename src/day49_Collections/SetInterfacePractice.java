package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200, 300, 40, 90));
        list.addAll(Arrays.asList(10,200, 300, 40, 90));
        list.addAll(Arrays.asList(10,200, 300, 40, 90));
        list.addAll(Arrays.asList(10,200, 300, 40, 90));
        list.addAll(Arrays.asList(10,200, 300, 40, 90));
        list.addAll(Arrays.asList(null, null, null));

        System.out.println("list = " + list);
        //list = [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10,
        // 200, 300, 40, 90, 10, 200, 300, 40, 90, null, null, null]
        // List allows duplicates
        // List has index number, therefore we can use get() method
        // List accepts null values

        System.out.println("-----------------------------------------------------------------");

        Set<Integer> hashSet = new HashSet<>(); //If the order is not matter, hashset is the fastest way
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("hashSet = " + hashSet);//[null, 200, 40, 10, 90, 300] the order is very random
        // Set does not allow duplicates, it means that removes duplicates
        // Set does not have index number, therefore we cannot use get() method!!!!!!!!!!!!!!!
        // System.out.println(hashSet.get(4));--> compile error
        // Set accepts null values

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet does not allow duplicates, it means that removes duplicates
        // LinkedHashSet does not have index number, therefore we cannot use get() method!!!!!!!!!!!!!!!
        // Child class of HashSet
        // It maintains the insertion order
        // It accepts null values
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);//linkedHashSet = [10, 200, 300, 40, 90, null]
        // It keeps order

        Set<Integer> treeSet = new TreeSet<>();
        // TreeSet does not allow duplicates, it means that removes duplicates
        // TreeSet does not have index number, therefore we cannot use get() method!!!!!!!!!!!!!!!
        // It implements the SortedSet interface
        // It maintains the sorted (Ascending) order!!!!!!!!!!!!!!!!
        // It does not accept null values!!!!!!!!!!!!!!!!!!!!!!!!!!
        // treeSet.addAll(Arrays.asList("harun", "Aysen", "ayse", "Harun"));
        // System.out.println("treeSet = " + treeSet); //treeSet = [Aysen, Harun, ayse, harun]
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //treeSet.addAll(Arrays.asList(null, null, null)); //NullPointerException, because treeSet does not accept null values

        System.out.println("treeSet = " + treeSet); //treeSet = [10, 40, 90, 200, 300] ascending orders
                                                    // from smaller to larger

    }
}
