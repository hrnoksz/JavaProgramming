package _00_Basics;

import java.util.Scanner;

public class _0_015_Basics_PrintVariable7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String topic1 = scan.nextLine();
        String topic2 = scan.nextLine();

        System.out.println("I will learn \"" + topic1 + "\" and \""+ topic2 + "\" at CybertekSchool." );

    }
}
/*
2 String variables are already declared and assigned values.
They will hold different topics we will learn.
Using those variables print the message exactly like below.
Ex:
Assume topic1 = "Java" and topic2 = "SQL"
You need to print exactly:
I will learn "Java" and "SQL" at CybertekSchool.
 */