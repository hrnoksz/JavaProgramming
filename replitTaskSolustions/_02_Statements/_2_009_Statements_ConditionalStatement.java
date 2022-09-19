package _02_Statements;

import java.util.Scanner;

public class _2_009_Statements_ConditionalStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name){
            case "Chen":
                System.out.println("teacher");
                break;
            default:
                System.out.println("student");
        }
       /*
        if(name == "Chen"){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }

        */

    }
}
/*
The variable name holds a String user input

Write a conditional statement that will determine if the person is a student or teacher.

If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:

input: Chen
output: teacher

input: Faa
output: student
 */