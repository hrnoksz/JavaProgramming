package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;

import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = null; // "null" keyword is special value for non-primitive data type
                           // which means no object is created
                           // null keyword is faster way to be eligible for garbage collection
        //System.out.println(str.toUpperCase()); //NullPointerException which means no object is created

        Car car1 = new Car("Toyota"); // car1 is eligible for garbage collector

        car1 = null;

        System.out.println(car1);

        System.out.println("---------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy"; // dog1 is eligible for garbage collector

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python"; //Python is eligible for garbage collector
        language = "Java";
        System.out.println(language);

        System.out.println("-----------------------------------------");


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1; // Same object (new ArrayList<>();) has two references (list1 and list2)
                                          // list1 and list2 are door of the same room.
                                          // Therefore, both of them has same elements

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1); // [100, 200, 300, 400]
        System.out.println(list2); // [100, 200, 300, 400]

        System.out.println(list1 == list2);

        System.out.println("------------------------------------");

        Student student1 = new Student("tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("--------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);




    }
}
