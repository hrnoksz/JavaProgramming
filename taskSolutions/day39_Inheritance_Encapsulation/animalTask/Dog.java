package day39_Inheritance_Encapsulation.animalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println(getName()+" eats dog food");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
/*
4. Create the following subclasses of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()
 */