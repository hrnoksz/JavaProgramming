package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 89;

        if(score >= 90 && score <= 100){
            System.out.println("Excellent");
        }else if(score >= 80 && score <= 89){
            System.out.println("Great");
        }else if(score >= 70 && score <=79){
            System.out.println("Good");
        }else if(score >=60 && score <= 69){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
/*
90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */