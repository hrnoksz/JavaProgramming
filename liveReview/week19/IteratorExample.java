package week19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<Integer> nums = new LinkedList<>();
        nums.addAll(Arrays.asList(34,67,33,11,12,65,100));

        Iterator<Integer> it = nums.iterator();
/*
        System.out.println("it.next() = " + it.next()); //34
        System.out.println("it.next() = " + it.next()); //67
        System.out.println("it.next() = " + it.next()); //33
        System.out.println("it.next() = " + it.next()); //11
        System.out.println("it.next() = " + it.next()); //12
        System.out.println("it.next() = " + it.next()); //65
        System.out.println("it.next() = " + it.next()); //100

 */
        //Iterator is another way of looping inside your collection
        while (it.hasNext()){
           if(it.next()%2 ==0){
               it.remove();
           }
        }
        System.out.println(nums); //[67, 33, 11, 65]

        List<Integer> nums2 = new LinkedList<>();
        nums2.addAll(Arrays.asList(34,67,33,11,12,65,100));

        for (Integer integer : nums2) { // Exception in thread "main" java.util.ConcurrentModificationException
            nums2.remove(integer);
        }

    }
}
