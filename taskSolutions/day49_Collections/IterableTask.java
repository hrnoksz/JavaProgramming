package day49_Collections;

import java.util.*;

public class IterableTask {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove the numbers less than four
        //Solution 1:
        list.removeIf(p->p<4);
        System.out.println(list);//[4, 5, 4, 5, 4, 5]

        //Solution 2:
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() < 4){
                it.remove();
            }
        }
        System.out.println(list);//[4, 5, 4, 5, 4, 5]

        System.out.println("----------------------------------------------------");

        //remove all the names "ahmed"
        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa",
                "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names1.removeIf(p->p.equalsIgnoreCase("ahmed"));
        System.out.println(names1); //[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        Iterator<String> it1 = names1.iterator();

        while (it1.hasNext()){
            if(it1.next().equalsIgnoreCase("ahmed")){
                it1.remove();
            }
        }
        System.out.println(names1);////[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        System.out.println("---------------------------------------------------------");

        //remove even number
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100, 100, 90, 89, 79, 50));
        set.removeIf(p->p%2==0);
        System.out.println(set); //[1, 3, 5, 7, 9, 79, 89]

        Iterator<Integer> it2 = set.iterator();
        while (it2.hasNext()){
            if(it2.next() %2 == 0){
                it2.remove();
            }
        }
        System.out.println(set); //[1, 3, 5, 7, 9, 79, 89]

        System.out.println("----------------------------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar",
                        "kayak", "reviver", "racecar", "madam")
        );

        // remove palindromes
        Iterator<String> it3 = names.iterator();

        while (it3.hasNext()){
            String reverse = "";
            String each = it3.next();
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse += each.charAt(i);
                if(each.equalsIgnoreCase(reverse)){
                    it3.remove();
                }
            }
        }
        System.out.println(names); //[Java, Python, Cydeo, Car]

        System.out.println("----------------------------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar",
                        "kayak", "reviver", "racecar", "madam")
        );
        names2.removeIf(str-> { String reverse = "";
            for (int i = str.length()-1; i >=0 ; i--) {
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        });

        System.out.println(names2); //[Java, Python, Cydeo, Car]



    }
}
