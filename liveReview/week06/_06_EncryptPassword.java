package week06;

import java.util.Scanner;

public class _06_EncryptPassword {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = scan.next();
        String encryptedPassword = "";
        char ch = 'x';

        for (int i = 0; i < password.length(); i++) {
            char ch1 = password.charAt(i);
            encryptedPassword += ""+ch1+ch;
        }
        System.out.println(encryptedPassword);

    }
}
/*
 * Given a string password. Encrypt with "x" a given password
 * and print.
 * (do with for loop)
 * password: cydeo
 * encrypt with char :x
 * output:cxyxdxexox
 */