package week06;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println("isArmstrong(153) = " + isArmstrong(153));

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        boolean flag = false;
        int originalNumber = number;  // I will do some actions on the number itself so I am storing the original number
        int digit = 0;
        int resultNumber = 0;
        List<Integer> digits = new ArrayList<>();
// some operations: if the result is capable of changing the flag; it will turn into true
        while (number > 0) {
            digit = number % 10;  // ---> 3
            digits.add(digit);
            number /= 10;
        }

        for (int eachDigit : digits) {
            int cubicValue = 1;
            for (int i = 0; i < digits.size(); i++) {
                cubicValue *= eachDigit;
            }
            resultNumber += cubicValue;
        }

        if (resultNumber == originalNumber) {
            flag = true;
        }

        return flag;
    }
}
/*
Task 4 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three and added
                to obtain a number. If the number obtained equals the original number then, we call that armstrong number.


                print all the armstrong numbers with three digit
                Armstrong numbers are     === 153 370 371 407 === for 3 digits

                 153   ==  (1*1*1)+(5*5*5)+(3*3*3)
                             1       125      27  == 153
                 153 % 10 ---3--- 153 / 10 = 15 : iteration 1
                 15 % 10 ----5-----15 / 10 = 1  : iteration 2
                 1 % 10  ----1---- 1  / 10 = 0  : iteration 3




    Task 5 :     Number of Steps to Main directory  --- Interview Task

                 We have a record of every time a change of directory is performed.The different change directory functions
                 are as follow ;

                     ../  Move to parent folder of current folder
                     ./   Remain in the same folder
                     x/   Move to the child folder named x


                     Write a method to Find the minimum steps required to go back to main directory from current folder.
                     The sequence of operations performed after entering the main directory provided


                     Input : {"x/","y/","../","z/","./"}
                            Main Folder---> x ----> z

                     Output : 2
 */