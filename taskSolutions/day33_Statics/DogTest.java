package day33_Statics;

public class DogTest {

    public static void main(String[] args) {

        Dog dog = new Dog("Yaman", "Kangal", "Big", 'M', 5, "Brown");

        System.out.println(dog);
        dog.eat();
        dog.play();
        dog.sleep();
        System.out.println(dog.numberOfLegs);
        System.out.println(dog.numberOfEyes);
        System.out.println(dog.numberOfWings);
    }
}
