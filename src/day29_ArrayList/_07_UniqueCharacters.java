package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _07_UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeef";
        String[] ch = str.split("");

        //Solution1:
        ArrayList<String> list = new ArrayList<>(Arrays.asList(ch)); // This is how to convert String array to ArrayList
        ArrayList<String> unique = new ArrayList<>(list);
        unique.removeIf(each-> Collections.frequency(list, each)>1);
        System.out.println("unique = " + unique);

        //Solution2:
        String str1 = "aaabcccdeeef";
        String[] arr = str1.split("");
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
        String unique1 = "";
        for (String each : list1) {
            int frequency = Collections.frequency(list1, each);
            if(frequency==1){
                unique1 += each;
            }
        }
        System.out.println("unique1 = " + unique1); //bdf

    }
}
