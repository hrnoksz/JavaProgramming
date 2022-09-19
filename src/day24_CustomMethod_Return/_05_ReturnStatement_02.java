package day24_CustomMethod_Return;

public class _05_ReturnStatement_02 {

    public static void main(String[] args) {

        nameOfMonths(14); //Invalid

    }
    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonths(int number){

        if(number < 1 || number > 12){ // if the condition is false, then ternary will be executed
            System.out.println("Invalid");
            return; // exits nameOfMonths method
        }
        String name = (number==1)?"January" :(number==2)?"February" :(number==3)?"March" :(number==4)?"April"
                    :(number==5)?"May" :(number==6)?"June" :(number==7)?"July" :(number==8)?"August"
                    :(number==9)?"September":(number==10)?"October" :(number==11)?"November" : "December";

        System.out.println("Months' name = " + name);
    }
}
