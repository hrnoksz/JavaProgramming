package _01_Variables;

import java.util.Scanner;

public class _1_009_Variables_Time {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour, minute, second;
        String amOrPm;

        hour = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.nextLine();

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);


    }
}
/*
In this assignment, you will write code to put together time of day.
Like this: 12:24:33 PM
Declare variables: hour, minute, second that can hold int values.
Declare amOrPm variable that can hold a String ("AM" or "PM")
Instructor will set different values to your variables
Using the variables and concatenation, print values in the format mentioned above.
 */
