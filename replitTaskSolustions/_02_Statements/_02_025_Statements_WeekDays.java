package _02_Statements;

import java.util.Scanner;

public class _02_025_Statements_WeekDays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();
        String result = "";

        switch (day) {

            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Not a valid day";
        }
        System.out.println(result);

    }
}
/*
Write a program that will print a week days according to the day number. Use Switch statement.
If an invalid day is entered print: "Not a valid day"

Example

Enter number:
1
Output: Monday

Enter number:
7
Output: Sunday
 */