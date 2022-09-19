package day39_Inheritance_Encapsulation.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println(getName()+" eats parrot food");
    }

    public void fly(){
        System.out.println(getName()+" is flying");
    }

    public void sing(){
        System.out.println(getName()+" is singing");
    }
}
/*
4. Parrot:
	Extra methods:
		fly()
		sing()
 */
