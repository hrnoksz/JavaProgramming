package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 11;
        String citizen = "USA";

        if(age >= 18 && citizen == "USA"){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible");
        }
    }
}
