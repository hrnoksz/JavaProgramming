package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class _08_LogIn {

    public static void main(String[] args) {

        // username: "Cydeo"
        // password: "Cydeo123"
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        //boolean valid = username.equals("Cydeo") && password.equals("Cydeo123");

        if(username.equals("Cydeo") && password.equals("Cydeo123")){ // if credentials are valid
            System.out.println("Logged in");
        }else{ // if credentials are not valid
            int attempts = 3; //3, 2, 1
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0){ // while the credentials
                // are invalid, and user has attempts to re-enter.
                if(attempts == 1){
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                username = scan.next();
                System.out.println("Enter your password:");
                password = scan.next();
                attempts--;
            }
            if(username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked.");
            }
        }
        scan.close();


    }
}
/*
 2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}
 */