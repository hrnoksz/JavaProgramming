package day52_Map_FunctionalInterface;

import java.util.*;

public class HighestFrequency1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("java", "java", "python", "c#"));

        String[] array = list.toArray(new String[0]);

        Map<String, Integer> result = new LinkedHashMap<>();

        int maxFrequency = 0;

        for (String each : array) {
           int frequency = Collections.frequency(Arrays.asList(array), each);
           if(frequency > maxFrequency){
               maxFrequency = frequency;
               result.put(each, frequency);
           }
        }
        System.out.println(result); //{java=2}

    }
}
/*
Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency
 */