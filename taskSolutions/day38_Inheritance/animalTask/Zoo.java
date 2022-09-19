package day38_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Karam", "Ankara", 3, 'F', "Medium", "Black");

        System.out.println(cat);

        cat.eat();

        Dog dog = new Dog("Yaman", "Kangal", 5, 'M', "Large", "Brown");

        System.out.println(dog);

        dog.eat();



    }
}
