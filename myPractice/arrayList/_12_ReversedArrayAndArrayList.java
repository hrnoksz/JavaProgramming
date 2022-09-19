package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _12_ReversedArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            reverse[j] = array[i];
        }
        System.out.println(Arrays.toString(reverse)); //[6, 5, 4, 3, 2, 1]

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        /*
        Collections.reverse(list);
        System.out.println(list);
         */

        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);

            reversedList.add(each);
        }
        System.out.println(reversedList); //[8, 7, 6, 5, 4, 3, 2, 1]

    }
}
