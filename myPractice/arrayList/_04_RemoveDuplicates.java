package arrayList;

import java.util.ArrayList;

public class _04_RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(40);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(result.contains(each)){
                continue;
            }
            result.add(each);
        }
        System.out.println(result); //[10, 20, 30]


       // list.removeIf(p->!(list.indexOf(p)==list.lastIndexOf(p)));

        //System.out.println(list);

    }
}
