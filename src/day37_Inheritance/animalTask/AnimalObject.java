package day37_Inheritance.animalTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Husky", 'M', 1, "Small", "White");

        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Tarcin", "British", 'M', 3, "Small", "Brown");

        System.out.println(cat1);
        cat1.scratch();
        cat1.meow();

        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "Small", "Blue");

        System.out.println(parrot1);
        parrot1.sing();
    }
}
