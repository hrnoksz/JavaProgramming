package day49_Collections;

import java.util.*;

public class ListSetPractice1 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println("set = " + set); //set = [1, 2, 3, 4, 5]
        //System.out.println(set.get(1)); compile error, because set doesn't have index number

        Integer[] arr1 = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 4, 5]
        System.out.println(arr1[0]); //1

        List<Integer> list = new ArrayList<>(set);
        System.out.println("list = " + list); //list = [1, 2, 3, 4, 5]
        System.out.println(list.get(0)); //1

        System.out.println("-------------------------------------------------");
    }
}
