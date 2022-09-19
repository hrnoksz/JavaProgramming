package day39_Inheritance_Encapsulation.animalTask;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt(){
        System.out.println(getName()+" likes hunting all kind of animals");
    }
}
/*
5. Create the following subclasses of WildAnimal and Override the hunt method,
	and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile
 */