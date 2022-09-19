package day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(priorityQueue); //[10, 40, 300, 200, 90] the order is random

        System.out.println("-------------------------------------");

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(arrayDeque); //[10, 200, 300, 40, 90] it keeps order

        System.out.println("--------------------------------------------");

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(linkedList); //[10, 200, 300, 40, 90] it keeps order

        System.out.println("------------------------------------------");

        priorityQueue.poll();

        System.out.println(priorityQueue); //[40, 90, 300, 200] First in, first out

        priorityQueue.poll();

        System.out.println(priorityQueue); //[90, 200, 300]

        arrayDeque.poll();

        System.out.println(arrayDeque); //[200, 300, 40, 90]

        linkedList.poll();

        System.out.println(linkedList); //[200, 300, 40, 90]

        System.out.println("***************************************");

        //System.out.println(priorityQueue.get(1)); compile error, because it doesn't have index number
        //System.out.println(arrayDeque.get(1)); compile error, because it doesn't have index number

        System.out.println(((List)linkedList).get(1)); //down casting
        //Linkedlist is a list and it also a queue.
        //Therefore, reference type is Queue above, in order to use get() method, we must do casting
        //After casting, reference type of linkedList is a list and list has get() method

        //The best way to use get method, when reference type of LinkedList is Queue

        System.out.println(((LinkedList<Integer>) linkedList).get(1));





    }
}
