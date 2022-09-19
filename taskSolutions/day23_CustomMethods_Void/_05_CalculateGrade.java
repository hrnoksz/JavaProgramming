package day23_CustomMethods_Void;

public class _05_CalculateGrade {

    public static void main(String[] args) {

        grade(100);

    }
    public static void grade(int score){
        String grade = "Invalid";
        if(score >= 0 && score <= 100){
           grade = (score >= 90)? "A" :(score >= 80)? "B" :(score >= 70)? "C" :(score >= 60)? "D" : "E";
        }
        System.out.println("grade= " + grade);
    }
}
