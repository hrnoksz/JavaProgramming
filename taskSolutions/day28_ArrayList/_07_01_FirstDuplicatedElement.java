package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_01_FirstDuplicatedElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int firstDuplicatedElement = 0;

        for (int i = 0; i < list.size(); i++) {
            int frequency = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)==list.get(j)){
                    frequency++;
                }
            }
            if(frequency > 1){
                firstDuplicatedElement = list.get(i);
                break;
            }
        }
        System.out.println("firstDuplicatedElement = " + firstDuplicatedElement);
    }
}
