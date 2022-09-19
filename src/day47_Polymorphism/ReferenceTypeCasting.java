package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Shape shape = new Circle(4); //upcasting is done implicitly

        Dog dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog3 = dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal; // down-casting
        dog.bark();

        System.out.println(animal.getName()); //Max

        //System.out.println(dog.getName()); // Max

        ((Dog)animal).bark(); // down-casting. We use down-casting to call method that are belongs to object type

        Shape shape1 = new Square(5);

        Square square = (Square) shape1; // If we use square variable more than once, we use this

        System.out.println(((Square) shape1).getSide()); //// If we use square variable only once, we use this

        System.out.println("----------------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        // Cat cat = (Cat) animal2; If we use cat variable more than once, we use this

        ((Cat)animal2).meow(); //If we use cat variable only once, we use this

        //((Dog) animal2).bark(); //There will be ClassCastException, because we cast animal2 to Cat and There is no "IS A"
                                // relation between Cat and Dog!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println("----------------------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);

        ((Tester) employee).bugReport();

        //((Developer)employee).unitTest();//There will be ClassCastException, because we cast employee to Tester and
        //Now reference type is Tester.
        // There is no "IS A" relationship between Tester and Developer!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //Driver driver = (Driver) employee;////There will be ClassCastException,
        Person person = (Person) employee; // Upcasting
        //Teacher teacher = (Teacher) employee; There will be ClassCastException

        System.out.println("---------------------------------------------------");




    }
}
