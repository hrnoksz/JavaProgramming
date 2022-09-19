package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int numberOfGroups = 0;
        String teacherInCharge = "";

        if(grade >= 1 && grade <=6){

            if(grade == 1){
                location = "Apple orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms. Smith";
            }else if (grade == 2){
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            }else if(grade == 3){
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
            }else if(grade == 4){
                location = "Movie theater";
                numberOfGroups = 2;
                teacherInCharge = "Ms. Reyes";
            }else if(grade == 5){
                location = "Museum";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Lela";
            }else{
                location = "Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr. Watt";
            }
        }else{
            System.out.println("Invalid grade");
        }
        System.out.println("location - " + location + "\nnumber of groups - " + numberOfGroups +
                "\nteacher in charge - " + teacherInCharge);
    }
}
