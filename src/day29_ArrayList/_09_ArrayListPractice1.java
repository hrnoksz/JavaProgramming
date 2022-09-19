package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _09_ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        //converting array to arraylist: we use asList() method
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(each-> each.length()>=10);

        //converting arraylist to array
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries)); //[Japan, Korea, Turkey, Canada]


    }
}
/*
1. create an Array of String called countries

2.Write a program that can remove all the country names that have length of 10 or greater
 */