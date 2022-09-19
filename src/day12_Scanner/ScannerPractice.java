package day12_Scanner;

//import java.util.*; // wild import: imports everything from the package
import java.util.Scanner; // regular import: imports one class

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int number = scan.nextInt();
        String result = "";

        if(number >=1 && number <=7){
            switch (number){
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result =  "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                default:
                    result = "Sunday";
            }
        }else{
            result = "Invalid Number";
        }
        System.out.println(result);

        System.out.println("--------------------------------------------");


        System.out.println("Enter a number between 1 to 7:");
        int num = scan.nextInt();
        String result1 = ""; // temporary value
        if(num>=1 && num<=8){
            result1 = (num == 1)? "Monday" :(num == 2)? "Tuesday" :(num == 3)? "Wednesday" :(num == 4)? "Thursday"
                            :(num == 5)? "Friday" :(num == 6)? "Saturday" : "Sunday";
        }else{
            result1 = "Invalid Number";
        }
        System.out.println(result1);

        scan.close();

        /*
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();

         */


    }
}
