package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);

        Person person2 = new Person("Kseniia", 'F', 28);

        Person person3 = new Person("Muhtar", 'M', 32);

        Person person4 = new Person("Oscar", 'M', 38);

        System.out.println(person1);
        System.out.println(person2);

        Person[] persons = {person1, person2, person3, person4};

        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(persons));
        System.out.println(personList);
        ArrayList<Person> malePersons = new ArrayList<>();
        ArrayList<Person> femalePersons = new ArrayList<>();

        for (Person each : persons) {
            if(each.gender=='M'){
                malePersons.add(each);
            }else {
                femalePersons.add(each);
            }
        }
        System.out.println(malePersons);
        System.out.println(femalePersons);


    }
}
