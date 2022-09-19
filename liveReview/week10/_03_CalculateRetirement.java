package week10;

public class _03_CalculateRetirement {

    public static void main(String[] args) {

        yearsUntilRetirement("Oscar", 1973);


    }
    public static int calculateAge(int yearOfBirth){
        return 2022-yearOfBirth;
    }
    public static void yearsUntilRetirement(String name, int yearOfBirth){
        int yearsUntilRetirement = 65-calculateAge(yearOfBirth);
        System.out.println(name + " is retire " + yearsUntilRetirement + " years");
    }
}
