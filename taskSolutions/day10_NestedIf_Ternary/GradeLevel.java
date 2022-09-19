package day10_NestedIf_Ternary;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 18;
        String result = "";

        if(number >= 1 && number <= 18){
            if(number <= 5){
                result = "Elementary school";
            }else if (number <= 8){
                result = "Middle school";
            }else if (number <= 12){
                result = "High school";
            }else if(number <= 16){
                result = "College";
            }else{
                result = "Grad school";
            }
        }else{
            result = "Invalid grade level";
        }
        System.out.println(result);

    }
}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */