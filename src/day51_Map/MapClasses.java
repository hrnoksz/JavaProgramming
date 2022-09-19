package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key     value   ==>For all objects, key must be unique, but value can be unique or duplicate
        Map<Integer, String> hashMap = new HashMap<>(); //Both key and value can be null
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isebella"); //Normally key must be unique, but If key is duplicated, first one (Ahmet) is removed
        hashMap.put(6, "Ahmet"); //Value can be duplicated
        hashMap.put(7, "Ahmet"); //Value can be duplicated
        hashMap.put(8, "Ahmet"); //Value can be duplicated
        hashMap.put(null, null); //both key and value accept null value
        hashMap.put(null, "Cihad"); //null means that it doesn't exist
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya"); //therefore, key must be unique, it returns only (null, "Hulya")

        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//Both key and value can be null
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Iseballa"); //Key must be unique, therefore last inserted one is accepted.
        linkedHashMap.put(null, "Hulya");
        linkedHashMap.put(null, null); //Both key and value can be null
        linkedHashMap.put(15, null);

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>(); //key cannot be null, but value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5, "Iseballa"); //Key must be unique, therefore last inserted one is returned
        //treeMap.put(null, "Hulya"); key CANNOT be null in TreeMap==> NullPointerException
        treeMap.put(11, null); //but value can be null
        System.out.println("treeMap = " + treeMap); //treeMap = {3=jack, 5=Iseballa, 10=Arthur, 11=null, 20=George, 40=Emma}
                                                    // it maintains sorted order by key

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
