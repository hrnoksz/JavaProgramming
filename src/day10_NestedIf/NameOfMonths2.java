package day10_NestedIf;

public class NameOfMonths2 {

    public static void main(String[] args) {

        int n = 11;
        // In ternary the total number of question marks (?) and the total number of colons (:) must be EQUAL
        // There are 11 question marks and 11 colons in this sample
        // Parenthesis are optional
        String name =(n == 1)? "January" :(n == 2)? "February" :(n == 3)? "March" :(n == 4)? "April"
                        :(n == 5)? "May" :(n == 6)? "June" :(n == 7)? "July" :(n == 8)? "August"
                        :(n == 9)? "September" :(n == 10)? "October" :(n == 11)? "November" : "December";

        System.out.println(name);

    }
}
