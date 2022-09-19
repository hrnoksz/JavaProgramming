package week02;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {

        String name = "Oscar"; // hard coded way

        // output goes to console---print or println
        System.out.println("Output");

        // How can I receive for my JAVA class?

        // 1. create your scanner object (object name can be anything)
        Scanner scanner = new Scanner(System.in); // you don't see anything

        // 2. prompt the user for putting input
        System.out.println("Put your name: "); // this is printed out to console

        // 3. get the input
        name = scanner.nextLine(); // reads the data from console and assigns the value to my variable

        // 4. use the value that I read
        System.out.println("name = " + name);

        // step 1 and step 3 are MUST, but step 2 and 4 depends on the situation
        // we need to import scanner class from JAVA utilities


    }
}
