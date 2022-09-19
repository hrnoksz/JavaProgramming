package day33_Statics;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Muhtar", 35, 'M');
        Person person2 = new Person("Oscar", 42, 'M');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);
    }
}
