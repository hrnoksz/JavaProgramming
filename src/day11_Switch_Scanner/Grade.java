package day11_Switch_Scanner;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
        String grade = scan.nextLine();
        String result = "";

        switch (grade){
            case "A":
                result = "excellent";
                break;
            case "B":
                result = "great job";
                break;
            case "C":
                result = "good";
                break;
            case "D":
                result = "passed";
                break;
            case "F":
                result = "failed";
                break;
            default:
                result ="invalid";

        }
        System.out.println("result = " + result);
    }
}
