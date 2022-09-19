package day21_ForEachLoop;

import java.util.Arrays;

public class _01_ArraysUtility_SortMethod {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums); //[I@511baa65 hashcode==> because toString method() don't execute implicitly in array
        System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5] ==> toString method() is used to print SINGLE dimensional array

        System.out.println(nums[0]); // 1

        System.out.println("----------------------------");

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores); //{55 .....100}

        System.out.println(Arrays.toString(scores)); // [55, 65, 78, 85, 95, 100]

        System.out.println("Min score: " + scores[0]); // 55
        System.out.println("Max score: " + scores[scores.length-1]); //100

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); //[Ahmet, Anna, Gunay, Maria, Sinema, Zuhal]

        String[] words = {"Anna", "ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); //[ANNA, Anna] ==> in ASCII table the value of uppercase letter is
                                                    // smaller than the value of lowercase letter.

    }
}
