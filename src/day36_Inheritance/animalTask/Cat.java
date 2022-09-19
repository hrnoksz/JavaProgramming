package day36_Inheritance.animalTask;

public class Cat extends Animal{ //Cat is an animal

    public void scratch(){
        System.out.println(name + " is scratching");
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }
}
/*
Dog:
	6 variables
	6 methods + 2 methods
	6 variables and 6 methods are inherited from parent class
 */