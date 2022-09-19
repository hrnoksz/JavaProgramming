package day40_FinalKeyword;

public class Zoom {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();

    }
}
