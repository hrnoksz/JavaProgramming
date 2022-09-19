package day39_Inheritance_Encapsulation.animalTask;

public class Tiger extends WildAnimal{


    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt(){
        System.out.println(getName()+" is not hunting today");
    }
}
