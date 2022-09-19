package day03_EscapeSequences;
/*
Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph space (tab)
    \\: single back slash
    \": double quote
 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("----------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("-------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("-------------------------------");

        System.out.println("/ \\"); // in order to print one backward slash we need to give two backward slashes

        System.out.println("--------------------------------");

        System.out.println("My favorite TV show is \"Game of Trone\" "); // in order to print double quote, we need to use\" \"

        System.out.println("How '\"confoundig' \"\\\" it is!");

        System.out.println("name\tage\theight");
        System.out.println("Archie\t17\t5'9\"");
        System.out.println("Betty\t17\t5'6\"");
        System.out.println("Jughead\t16\t6'");

        System.out.println("\ta\tb\tc");
        System.out.println("\\\\");
        System.out.println("'");
        System.out.println("\"\"\"");
        System.out.println("C:\nin\the downward spiral");




    }
}
