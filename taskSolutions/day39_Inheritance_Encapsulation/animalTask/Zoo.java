package day39_Inheritance_Encapsulation.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Karam", "Ankara", 'F', 3, "Large", "Black");

        System.out.println(cat);

        cat.eat();
        cat.meow();
        cat.scratch();
        boolean catIsFriendly = FriendlyAnimal.isFriendly;
        System.out.println(catIsFriendly);

        System.out.println("--------------------------------------");
        Dog dog = new Dog("Yaman", "Kangal", 'M', 5, "Large", "Brown");

        System.out.println(dog);
        dog.eat();
        dog.bark();

        System.out.println("---------------------------------------------");

        Lion lion = new Lion("Zeneca", "Africa", 'M', 5, "Large", "Brown");

        System.out.println(lion);

        lion.hunt();



    }
}
