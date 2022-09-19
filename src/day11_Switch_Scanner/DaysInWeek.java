package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        // long number = 9L;
        // float number = 9F;
        // double number = 19D;
        // boolean number = true;
        // These four data types CANNOT be used as switch's data. Because switch statement's expression
        // MUST be evaluated to a SINGLE VALUE.
        // We can use BYTE, SHORT, INT, CHAR and STRING data types in order to evaluate the values


        int number = 5;

        switch (number) { //1,2,3,4,5,6,7

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break; // exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break; // if there were not "break statement" here, then case 6 would be executed too.
                       // Outputs are ===> Friday, Saturday
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // only gets executed if none of the case blocks are matching. It can be placed everywhere.
                System.out.println("Invalid number");
                // we don't need to give break statement for the last block of the switch in order to exit the switch

        }
    }
}
