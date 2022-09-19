package day08_SingleIfStatement;

public class SchoolType {

    public static void main(String[] args) {

        byte gradeLevel = 8;

        boolean a = gradeLevel >= 1 && gradeLevel <= 5;
        boolean b = gradeLevel >= 6 && gradeLevel <= 8;
        boolean c = gradeLevel >= 9 && gradeLevel <= 12;
        boolean d = gradeLevel >= 13 && gradeLevel <= 16;
        boolean e = gradeLevel >= 17 && gradeLevel <= 18;

        if(a){
            System.out.println("Elementary school");
        }
        if(b){
            System.out.println("Middle school");
        }
        if(c){
            System.out.println("High school");
        }
        if(d){
            System.out.println("College");
        }
        if(e){
            System.out.println("Grad school");
        }
    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */