package arrayList;

import java.util.ArrayList;

public class _05_FirstUniqueElements {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list); //[1, 1, 2, 3, 3, 4, 5, 5]

        for (int i = 0; i < list.size(); i++) {
            int frequency = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)==list.get(j)){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(list.get(i)); // 2
                break;
            }
        }

    }
}
