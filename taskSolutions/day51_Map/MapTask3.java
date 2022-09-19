package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapTask3 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female
/*
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key, "Male");
            }
            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }
        System.out.println(employeeMap);

 */
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("f")){
                entry.setValue("Female");
            }
            if(entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
            }
        }
        System.out.println(employeeMap);

        System.out.println("--------------------------------------------------------------");

        //  2. Display the names of all female employees
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            String eachKey = entry.getKey();
            String eachValue = entry.getValue();
            if(eachValue.equalsIgnoreCase("female")){
                System.out.println(eachKey);
            }
        }
        System.out.println("------------------------------------------------------------------");
        // 2. Display the names of all male employees
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            String eachKey = entry.getKey();
            String eachValue = entry.getValue();
            if(eachValue.equalsIgnoreCase("male")){
                System.out.println(eachKey);
            }
        }
        System.out.println("-----------------------------------------------------------");
        // 3. Display the names of employees that start "A"
        for (String each : employeeMap.keySet()) {
            if(each.startsWith("D")){
                System.out.println(each);
            }
        }

    }
}
