package week13;

public class PersonTest {

    public static void main(String[] args) {

        Person personOne = new Person("Mike", "Smith", 30);

        System.out.println(personOne);

        //Can I change this person's name?
        //personOne.firstName = "Oscar"; no access to data
    }
}
