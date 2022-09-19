package day12_Scanner;

import java.util.Scanner;

public class GradeReport1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scan.nextInt();

        scan.close(); // we no longer need scanner after this line

        String result = "Invalid Score";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }

        }

        System.out.println(result);

    }
}
