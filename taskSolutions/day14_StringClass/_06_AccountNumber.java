package day14_StringClass;

import java.util.Scanner;

public class _06_AccountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String accountNumber = scan.nextLine();
        scan.close();
        char first = accountNumber.charAt(0);
        String result = "";

        if(first == '2' && accountNumber.length() == 7){
                result = "valid";
        }else if (first == '5' && accountNumber.length() == 10){
                result = "valid";
        }else{
            result = "Invalid account number";
        }
        System.out.println(result);
    }
}
/*
6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */