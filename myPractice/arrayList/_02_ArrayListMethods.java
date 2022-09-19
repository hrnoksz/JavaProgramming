package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayListMethods {

    public static void main(String[] args) {

        // add(data) method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7
        System.out.println(numbers);
        // add(index, data) method
        numbers.add(2, 25); // 2
        numbers.add(5, 45); // 5
        System.out.println(numbers);

        System.out.println("-----------------------");

        // size() method
        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        // get(index) method:

        int num = numbers.get(3);
        System.out.println("num = " + num); // 30

        System.out.println("---------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("-----------------------------------");

        // set method(index, data)
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript"); // replace
        list.set(3, "C++");

        System.out.println(list); //[Java, Python, JavaScript, C++, Ruby]

        boolean result = list.remove("Python");
        System.out.println(result);

        System.out.println("-------------------------------------");

        // remove method(int index)

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees); //[Neira, Ali, Hulya, Kaloyan]

        employees.remove(1);

        System.out.println(employees); //[Neira, Hulya, Kaloyan]

        employees.remove(employees.size()-1);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(200);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);

        System.out.println(list1); //[100, 200, 200, 200, 300, 400, 500]
/*
        list.remove(1);
        System.out.println(list);

 */

        Integer num1 = 200;
        list.remove(num1);
        System.out.println(list1); //[100, 200, 200, 300, 400, 500]
        boolean r = list1.remove(num1);
        System.out.println(r); // true

        System.out.println("-----------------------------");

        // clear method()
        System.out.println(list1.size()); // 5
        list1.clear();
        System.out.println(list1); //0

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
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(100);
        list3.add(100);
        list3.add(100);

        System.out.println(list2 == list3); // false
        System.out.println(list2.equals(list3)); // true

        System.out.println("-----------------------------------");

        // isEmpty method()
        list1.clear();
        boolean r4 = list1.isEmpty();
        System.out.println(r4); // true, because size of list1 is zero

        System.out.println("----------------------------------");
        // adAll method();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers1.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers1);

        int[] array = {1,2,3,4,5};
        ArrayList<Integer> numbers2 = new ArrayList<>();

        for (int each : array) {
            numbers2.add(each);
        }
        System.out.println(numbers2);

    }
}
