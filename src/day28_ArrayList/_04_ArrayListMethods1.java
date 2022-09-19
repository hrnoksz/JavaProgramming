package day28_ArrayList;

import java.util.ArrayList;

public class _04_ArrayListMethods1 {

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

        System.out.println("----------------------------");

        // remove(Object) method:

        boolean r1 = employees.remove("Hulya");

        System.out.println(employees); //[Neira]

        System.out.println("r1 = " + r1); // true


    }
}
