package day38_Inheritance.animalTask;

public class Eagle extends Animal{


    public Eagle(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void eat(){
        System.out.println(getName()+" eats snake");
    }
}
/*
4. Eagle
	eat(): eats snake
 */