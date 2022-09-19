package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String[] array = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        int maxFrequency = 0;

        for (String each : array) {
            int frequency = Collections.frequency(Arrays.asList(array), each);
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                result.put(each, maxFrequency);
            }
        }
        System.out.println(result); //{e=5}

    }
}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
 */