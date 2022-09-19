package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask2 {

    public static void main(String[] args) {

        // student name & score:
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 85);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        System.out.println("students = " + students);

        System.out.println(students.size());

        //display the score of Alex
        System.out.println(students.get("Alex")); //96

        //replace Ali's score to 90
        students.replace("Ali", 90);
        System.out.println(students);//{Alex=96, Andriy=98, Aygun=85, Maria=85, Ozan=98, Serkan=97, Ali=90}

        //remove() method
        students.remove("Alex"); //{Andriy=98, Aygun=85, Maria=85, Ozan=98, Serkan=97, Ali=90}
        System.out.println(students);

        students.remove("Ozan");
        System.out.println(students); //{Andriy=98, Aygun=85, Maria=85, Serkan=97, Ali=90}

        //containsKey() method---> returns boolean
        boolean r1 = students.containsKey("Muhtar");
        System.out.println(r1); //false
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r2); // true

        //containsValue() method--->returns boolean
        boolean r3 = students.containsValue(100);
        System.out.println(r3); //false
        boolean r4 = students.containsValue(98);
        System.out.println(r4); //true

        //isEmpty() method---> returns boolean
        System.out.println(students.isEmpty()); // false

        System.out.println("---------------------------------");
        //equals() method---> returns boolean
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.putAll(students);

        System.out.println(map1 == map2); //false
        System.out.println(map1.equals(map2)); //true

        //clear() method
        map1.clear();
        System.out.println(map1);//{}
        map2.clear();
        System.out.println(map2);//{}

    }
}
