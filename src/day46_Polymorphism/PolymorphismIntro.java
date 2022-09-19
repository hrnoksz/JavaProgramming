package day46_Polymorphism;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Rectangle;
import day39_Recap.shapeTask.Shape;
import day39_Recap.shapeTask.Square;
import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shape.Triangle;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4), new Square(7)};
        // Object class is parent of all the classes

        System.out.println(Arrays.toString(array));

        /*
            WebDriver driver;

            driver = new ChromeDriver();

            driver = new FireFoxDriver();
         */

        Employee tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
        Employee developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);
        Employee teacher = new Teacher("Angel", 28, 'F', 34, "English Teacher", 85000.00);
        Employee driver = new Driver("John", 34, 'M', 42, "Truck Driver", 75000.00);

        ArrayList<Employee> cydeoEmployees = new ArrayList();
        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        System.out.println("----------------------------------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);

        employee.work(); //Ali is testing the application

        //employee.bugReport(); compile error because bugReport method was not created within parent class(employee)

        Employee employee1 = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);

        employee1.work(); //Alex is developing application

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal.drink(); //Max is drinking water
        animal.eat(); // Max eats Pizza
        //animal.play(); compile error because play() method was not created within parent class(Animal)
        //animal.bark(); compile error because bark() method was not created within parent class(Animal)

        Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play(); //When we call a method, it will call overridden version from a child class!!!!!!!!!!!!!!!!
        // Object type decides which implementation of the method to be executed when the method is called. But,
        // if there is not overridden method inside subclass, then original method in parent class will be executed!!!!!!!!!
        //animal2.drink(); compile error because drink() method was not created within interface class(Playable)
        //animal2.eat(); // compile error, because Reference type (Playable) does not have eat() method.
        Dog animal1 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //If we use Dog as a reference type instead of Animal, then we can call all the methods that belongs to
        // both parent class (Animal) and subclass (Dog)
        animal1.drink(); //Max is drinking water
        animal1.eat();// Max eats Pizza
        animal1.bark(); //Max is barking
        animal1.play(); // Max is playing with ball

        Animal animal3 = new Cat("Karam", "Ankara", 'F', 3, "Small", "Black");
        animal3.eat(); //Here reference type is Animal which decides what is accessible. That means there are two methods
        // inside parent (Animal) class. Therefore, we can call only these two methods (eat and drink)
        animal3.drink();

        Shape shape = new Circle(5);
        shape.area();

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare); //false
        System.out.println("isRectangle = " + isRectangle); // false
        System.out.println("isCircle = " + isCircle); // true



        /*
            WebDriver driver;

                if(driver instanceof Chrome){
                    Chrome browser will open
                }else if(driver instanceof Firefox){
                    Firefox browser will open
                }
         */




        /*
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new ChromeDriver();
        driver1.get(amazon);
        driver2.get(google);
         */









    }
}
