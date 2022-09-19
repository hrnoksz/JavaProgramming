package day39_Inheritance_Encapsulation.animalTask;

public class Cat extends FriendlyAnimal{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println(getName()+" eats cat food");
    }

    public void scratch(){
        System.out.println(getName()+" likes scratching");
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
    }
}
/*
2. Cat:
		Extra methods:
			scratch()
			meow()
 */