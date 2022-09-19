package day53_FunctionalInterface;

import java.util.List;

public class GenericClass <T>{

    public void printEach(T[] array){
        for (T each : array) {
            System.out.println(each);
        }
    }

    public void printEach(List<T> list){
        for (T each : list) {
            System.out.println(each);
        }
    }
}
