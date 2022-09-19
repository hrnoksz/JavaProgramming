package day23_CustomMethods_Void;

public class _04_EligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(19, "usa");

    }
    public static void eligibleToVote(int age, String citizen){
        if(age >= 18 && citizen.equalsIgnoreCase("usa")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
