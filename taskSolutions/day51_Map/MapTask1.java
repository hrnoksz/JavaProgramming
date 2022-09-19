package day51_Map;

import java.util.*;

public class MapTask1 {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Harun");
        hashMap.put(11, "Oscar");
        hashMap.put(12, "Muhtar");
        hashMap.put(13, "Gurhan");
        hashMap.put(14, "Asiya");
        hashMap.put(null, "null");

        System.out.println("hashMap = " + hashMap);

        System.out.println("---------------------------------------------------------");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Harun");
        linkedHashMap.put(11, "Oscar");
        linkedHashMap.put(12, "Muhtar");
        linkedHashMap.put(13, "Asiya");
        linkedHashMap.put(14, "Gurhan");
        linkedHashMap.put(null, "null");

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("-----------------------------------------------------");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(6, "Iseballa");
        treeMap.put(null, "Iseballa"); //NullPointerException=>key cannot be null
        treeMap.put(8, null); //value can be null

        System.out.println("treeMap = " + treeMap);

        System.out.println("-----------------------------------------------------");

        Map<Integer, String> hashtable = new Hashtable<>(); //both key and value CANNOT be null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5, "Iseballa");
        //hashtable.put(null, null); //Hashtable does NOT accept null for both key and value
        //NullPointerException
        //Hashtable is synchronized (thread-safe)
        System.out.println("hashtable = " + hashtable);

    }
}
