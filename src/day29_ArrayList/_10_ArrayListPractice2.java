package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _10_ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmet", "Jimmy", "Daniel", "Aaron", "Ahmet", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmet", "David"));

        System.out.println(employees); //[David, Ahmet, Ahmet, David]

        System.out.println("-----------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(each -> each.startsWith("M"));

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names)); //[Sumeyra, Hasan, Beril]
    }
}
