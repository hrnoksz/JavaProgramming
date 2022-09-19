package day38_Inheritance.animalTask;

public class Cat extends Animal{


    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }


    public void eat() {
        System.out.println(getName()+" is eating cat food");;
    }
}
/*
1. Cat
	eat(): eats cat food
 */