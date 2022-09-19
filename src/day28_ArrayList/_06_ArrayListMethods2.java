package day28_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class _06_ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list); //[100, 200, 200, 200, 300, 400, 500]
/*
        list.remove(1);
        System.out.println(list);

 */

        Integer num = 200;
        list.remove(num);
        System.out.println(list); //[100, 200, 200, 300, 400, 500]
        boolean r = list.remove(num);
        System.out.println(r); // true

        System.out.println("-----------------------------");

        // clear method()
        System.out.println(list.size()); // 5
        list.clear();
        System.out.println(list); //0

        System.out.println("--------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');
        System.out.println(a); //0
        System.out.println(b); //4

        System.out.println("-----------------------------");

        // contains method()
        boolean r1 = characters.contains('A');
        boolean r2 = characters.contains('Z');
        System.out.println(r1); // true
        System.out.println(r2); // false

        System.out.println("--------------------------------");

        // equals method():
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // false
        System.out.println(list1.equals(list2)); // true

        System.out.println("-----------------------------------");

        // isEmpty method()
        list1.clear();
        boolean r4 = list1.isEmpty();
        System.out.println(r4); // true, because size of list1 is zero

        System.out.println("----------------------------------");
        // adAll method();
        ArrayList<Integer> numbers = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers);
    }
}
