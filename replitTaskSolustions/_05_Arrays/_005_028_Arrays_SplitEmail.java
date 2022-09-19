package _05_Arrays;

import java.util.Scanner;

public class _005_028_Arrays_SplitEmail {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String[] array = email.split("@");

        if(email.contains("@") && (email.indexOf("@") == email.lastIndexOf("@"))){
            System.out.println("Email id: " + array[0]);
            System.out.println("Email domain: " + array[1]);
        }else{
            System.out.println("invalid email");
        }

    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
Output:
invalid email

email -> my@fancy@email.com
Output:
invalid email
 */