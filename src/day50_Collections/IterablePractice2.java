package day50_Collections;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        //remove all the names "ahmed"

        Iterator<String> it = names1.iterator();

        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names1);//[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        System.out.println("===================================================");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));
        names2.removeIf(each-> each.equalsIgnoreCase("ahmed"));

        System.out.println(names2); //[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        System.out.println("===================================================");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        for(Iterator<String> i=names3.iterator(); i.hasNext() ;  ){
            if(i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }

        System.out.println(names3); //[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        System.out.println("==============================================");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100, 90, 89, 79, 50));

        Iterator<Integer> q = set.iterator();

        while (q.hasNext()){
            if(q.next() %2 == 0){
                q.remove();
            }
        }
        System.out.println(set); //[1, 3, 5, 7, 9, 79, 89]

    }
}
