package week03;

public class Grader {
    public static void main(String[] args) {

        // for a given score assign Letter Grades

        int score = 75;
        char note;

        if(score>90 && score<=100){
            note = 'A';
        }else if(score>80 && score <=89){
            note = 'B';
        }else if(score>70 && score<=79){
            note = 'C';
        }else if(score>60 && score<=69){
            note = 'D';
        }else {
            note = 'F';
        }
        System.out.println("note = " + note);
    }
}
