package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".");

        System.out.println("-----------------------------------------------------");

        // My favorite book is "bookName"

        String bookName = "Rich Dad and Poor Dad";

        System.out.println("My favorite book is " + "\"" + bookName + "\"");

        System.out.println("My favorite book is " + "'" + bookName + "'");

        /*
        \n ==> all the escape sequences are used in double quote "\\", "\"", "\t", "\n"
        \t
        \"
        \\
         */

    }
}
/*
Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)
			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */