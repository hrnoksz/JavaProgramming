package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        //distinct()--> eliminate duplicates
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list1 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1); //[1, 2, 3, 4, 5, 6]

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 4, 5, 6]

        System.out.println("--------------------------------------------------------");

        //skip()--> skips the elements by the given number
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2); //[6, 7, 8, 9, 10]

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(3).toArray();
        System.out.println(Arrays.toString(nums2)); //[4, 5, 6, 7, 8, 9, 10]

        System.out.println("----------------------------------------------------------");

        //limit()
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).collect(Collectors.toList());
        System.out.println(list3); //[1, 2, 3, 4, 5, 6, 7]

        //map()!!!!!!!!!!!!!!!!!!!!!
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map(p-> p * 10).collect(Collectors.toList());
        System.out.println(list4); //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"));

        days = days.stream().map(p->p.substring(0,3)).collect(Collectors.toList());
        System.out.println(days); //[Mon, Tue, Wed, Thu, Fri, Sat, Sun]

        System.out.println("-------------------------------------------------");

        //filter()!!!!!!!!!!!!
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(evens); //[2, 4, 6, 8, 10]

        //count()-->Usually this method is used with filter() method
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        int numberOfDivisible3 = (int) list6.stream().filter(p->p%3==0).count();
        System.out.println(numberOfDivisible3); //4

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));

        int count = 0;
        for (String each : names) {
            if(each.equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count); // 3

        //Or we can solve with this way
        // count returns long primitive data types
        long countOfJava = names.stream().filter(p->p.equalsIgnoreCase("java")).count();
        System.out.println(countOfJava); //3

        System.out.println("---------------------------------------");

        //forEach()
        names.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));

        System.out.println("-------------------------------------------------");
        //allMatch(), anyMatch() and nonMatch -----> all of them return boolean

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));

        boolean r1 = list7.stream().allMatch(p->p%2==0);

        System.out.println(r1); // false, because not all the numbers are even

        boolean r2 = list7.stream().anyMatch(p-> p > 4);

        System.out.println(r2); //true, because there are numbers greater than 4 in the list

        boolean r3 = list7.stream().noneMatch(p->p%3==0);

        System.out.println(r3); // false, because there are numbers that are divided by 3 in the list



    }
}
