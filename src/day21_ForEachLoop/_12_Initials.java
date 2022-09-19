package day21_ForEachLoop;

public class _12_Initials {

    public static void main(String[] args) {

        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "API Testing"};

        for (String each : names) {
            String initial = each.charAt(0) +"."+ each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }
    }
}
/*
1. create an array named classmates, and store 5 of your classmates' full names
   print the initials of each classmate in separate lines
 */