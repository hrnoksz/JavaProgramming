package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;

    public Circle(double radius) { // Constructor is only for instance variables
        this.radius = radius;
    }

    static { //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Static block is used to initialize static variables
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


    public static void main(String[] args) {
/*
        We can initialize static variable in main method as well.
        Because main method is also static. And static accepts static
        If we don't create main method in the same class, outputs on console will be like CircleTest class

 */

        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

}}

