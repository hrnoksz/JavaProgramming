package week13;

import java.util.Scanner;

public class Password {

    private String password;

    public Password(){ //default constructor

    }

    Scanner scanner = new Scanner(System.in);

    public String getPassword(){ //getter method()
        if(password==null){
            System.out.println("Password is null. Assign a value for it");
            password = scanner.next();
        }else{
            System.out.println("It has a value, just returning it");
        }
        return password;
    }
}
