package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericClassTest {

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5};

        String[] names = {"Harun", "Oscar", "Muhtar"};

        GenericClass<Integer> obj = new GenericClass<>();

        obj.printEach(numbers);

        GenericClass<String> obj1 = new GenericClass<>();

        obj1.printEach(names);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        GenericClass<Integer> obj3 = new GenericClass<>();
        obj3.printEach(list);


    }
}
