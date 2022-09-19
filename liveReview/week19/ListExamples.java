package week19;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {

        List<String> listOne = new ArrayList<>(); //polymorphic way
        ArrayList<String> arrayList = new ArrayList<>(); // not polymorphic

        List<String> listTwo = new Stack<>();//polymorphic way

        listOne.add("Mike");
        listOne.add("Oscar");
        listOne.addAll(Arrays.asList("Selena", "Cemal", "Nihal", null, null, null, "Selena", "Oscar"));
        System.out.println("listOne = " + listOne); //[Mike, Oscar, Selena, Cemal, Nihal, null, null, null, Selena, Oscar]

        listTwo.addAll(listOne);
        System.out.println("listTwo = " + listTwo); //[Mike, Oscar, Selena, Cemal, Nihal, null, null, null, Selena, Oscar]

        /*
        Stack methods
        peek()---> brings you the element which last LIFO: Last in First out
        pop()---> brings you the element which last LIFO: Last in First out and deletes the element
        push()--> similar to add method
         */
        String str = ((Stack<String>) listTwo).peek(); //since it is created in polymorphic way I have to cast to Stack
        System.out.println("str = " + str); // Oscar

        str = ((Stack<String>) listTwo).pop();

        System.out.println("listTwo = " + listTwo);

        ((Stack<String>) listTwo).push("Oscar");
        System.out.println("listTwo after push method = " + listTwo);

        //Collection Utility Class comes with useful methods such as sorting

       List<Integer> listThree = new Stack<>();
       listThree.addAll(Arrays.asList(45,55,2,89,34,1000,-56, 564, 987));
       System.out.println("listThree before sorting = " + listThree);
       Collections.sort(listThree);
       System.out.println("listThree after sorting= " + listThree);

       //******Likewise, TreeSet does not accept null value since internally using Sorting
       // Any collection framework which has some type sorting  -----> DOES NOT ACCEPT NULL Values

        for (int i = 0; i < listThree.size(); ) {   // 9 --> 8 ---->.....0 size becomes zero that is why we get out of loop,
            // we don't need i++ increment
            int x = ((Stack<Integer>) listThree).pop();
            System.out.println("Next number = " + x);
        }

        List<Integer> listFour = new LinkedList<>();
        listFour.add(10);
        listFour.addAll(Arrays.asList(23,30,13,11));
        /*
        Methods that comes from concrete LinkedList class
        addFirst();
        addLast();
        poll();
         */
        ((LinkedList<Integer>) listFour).addFirst(1);
        ((LinkedList<Integer>) listFour).addLast(100);
        System.out.println("listFour = " + listFour); //listFour = [1, 10, 23, 30, 13, 11, 100]

        //Since we can cast list to LinkedList it allows us to use Deque methods such as poll() method
        int x = ((LinkedList<Integer>) listFour).poll();
        System.out.println("x = " + x); // 1
        System.out.println("listFour = " + listFour);//listFour = [10, 23, 30, 13, 11, 100]




    }
}
