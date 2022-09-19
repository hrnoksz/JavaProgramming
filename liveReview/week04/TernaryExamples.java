package week04;

public class TernaryExamples {
    public static void main(String[] args) {

        int score1 = 25;

        String result = (score1>60)? "passed" : "failed";
        System.out.println(result);

        System.out.println((score1>60)? "passed" : "failed");


    }
}
