package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        /*
        90~100: excellent
        80~89: Great
        70~79: Good
        60~69 : Passed
        0~59 : Failed
         */

        int s = 78;
        // Solution1
        if (s >= 0 && s <= 100) { // if the score is valid (0 ~ 100)
            if (s >= 90) { // false: score < 90
                System.out.println("Excellent");
            } else if (s >= 80) { // false: score < 80
                System.out.println("Great");
            } else if (s >= 70) { // false: score < 70
                System.out.println("Good");
            } else if (s >= 60) { // false: score < 60
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else { // if the score is NOT valid
            System.out.println("Invalid score");
        }

        System.out.println("---------------------------------------");

        // Solution2:
        String result = (s >= 0 && s <= 100)? (s >= 90)? "Excellent" :(s >= 80)? "Great" :(s >= 70)? "Good"
                        :(s >= 60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);

        System.out.println("-----------------------------------------");

        // Solution 3:
        String result2 = "";

        if (s >= 0 && s <= 100) { // if the score is valid (0 ~ 100)
            result2 = (s >= 90)? "Excellent" :(s >= 80)? "Great" :(s >= 70)? "Good"
                    :(s >= 60)? "Passed" : "Failed";
        } else { // if the score is NOT valid
           result2 = "Invalid score";
        }
        System.out.println(result2);

    }
}
