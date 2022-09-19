package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_Grades {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer each : scores) {
            if(each >= 90){
                gradeOfA.add(each);
            }else if(each >= 80){
                gradeOfB.add(each);
            }else if(each >= 70){
                gradeOfC.add(each);
            }else if (each >= 60){
                gradeOfD.add(each);
            }else{
                gradeOfF.add(each);
            }
        }
        System.out.println("Total number of grade A: " + gradeOfA.size()); //2
        System.out.println("Total number of grade B: " + gradeOfB.size()); //2
        System.out.println("Total number of grade C: " + gradeOfC.size()); //3
        System.out.println("Total number of grade D: " + gradeOfD.size()); //1
        System.out.println("Total number of grade F: " + gradeOfF.size()); //4
    }
}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */