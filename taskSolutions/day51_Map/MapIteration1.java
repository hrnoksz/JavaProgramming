package day51_Map;

import java.util.*;

public class MapIteration1 {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 99);
        students.put("Serkan", 70);
        students.put("Andriy", 98);

        Set<String> keys = students.keySet();
        System.out.println("keys = " + keys);//keys = [Alex, Andriy, Aygun, Maria, Ozan, Serkan, Ali]
        //keys.removeIf(p->p.startsWith("A"));
        //System.out.println(keys); //[Maria, Ozan, Serkan]

        //Collection<Integer> scores = students.values();
        List<Integer> scores = new ArrayList<>(students.values());
        System.out.println("scores = " + scores); //scores = [80, 98, 95, 90, 99, 70, 85]
        int max = Collections.max(scores);
        System.out.println("max = " + max); //99
        int min = Collections.min(students.values());
        System.out.println("min = " + min); //70

        System.out.println("--------------------------------------------------");

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds); //earlyBirds = {Andriy=98, Aygun=95, Maria=90, Ozan=99}
        System.out.println("angryBirds = " + angryBirds); //angryBirds = {Alex=80, Serkan=70, Ali=85}

        System.out.println("-------------------------------------------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer eachValue : students.values()) {
            if(eachValue > maxScore){
                maxScore = eachValue;
            }
            if(eachValue < minScore){
                minScore = eachValue;
            }
        }
        System.out.println("maxScore = " + maxScore); //99
        System.out.println("minScore = " + minScore); //70

        System.out.println("------------------------------------------------------------------");

        // how many students has the score of 95 0r greater

        int count = 0;
        for (Integer value : students.values()) {
            if(value >= 95){
                count++;
            }
        }
        System.out.println("count = " + count); //3

        System.out.println("------------------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
