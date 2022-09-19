package day24_CustomMethod_Return;

public class _06_Return_vs_ExitMethod {

    public static void main(String[] args) {

        nameOfMonths(50); // Invalid

        System.out.println("Hello World");
    }
    public static void nameOfMonths(int number){

        if(number < 1 || number > 12){ // if the condition is false, then ternary will be executed
            System.out.println("Invalid");
            return; // exits nameOfMonths method
            //System.exit(0); // when we use exit method, every thing will be terminated
                                  // Then there is only "invalid" on display
                                  // But if we use return statement instead of exit statements, only current
                                  // method is exited. Then there are both "Invalid" and "Hello World" on display
        }
        String name = (number==1)?"January" :(number==2)?"February" :(number==3)?"March" :(number==4)?"April"
                :(number==5)?"May" :(number==6)?"June" :(number==7)?"July" :(number==8)?"August"
                :(number==9)?"September":(number==10)?"October" :(number==11)?"November" : "December";

        System.out.println("Months' name = " + name);
    }
}
