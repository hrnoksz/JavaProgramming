package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_SomeUsefulMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        System.out.println(list); //[1, 3]

        list.remove(Integer.valueOf(1));
        System.out.println(list); //[3]

        // array to array list
        String[] array = {"red", "green", "blue"};
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList(array));
        System.out.println(listTwo);

        // array list into an array
        String[] arrayTwo = listTwo.toArray(new String[0]);
        System.out.println(Arrays.toString(arrayTwo));

        // how to make an int array to an Integer ArrayList

        int[] arrayThree = {1,2,3,4};
        ArrayList<Integer> listThree = new ArrayList<>();

        for (Integer each : arrayThree) {
            listThree.add(each);
        }
        System.out.println(listThree);

    }
}
