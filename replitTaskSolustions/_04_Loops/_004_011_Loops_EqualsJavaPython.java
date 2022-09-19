package _04_Loops;

import java.util.Scanner;

public class _004_011_Loops_EqualsJavaPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        scan.close();
        int counterOfJava = 0;
        int counterOfPython = 0;

        for (int i = 0; i <= sentence.length()-"java".length(); i++) {
            if(sentence.substring(i, i+4).contains("java")){
                counterOfJava++;
            }
        }
        for (int i = 0; i <= sentence.length()-"python".length() ; i++) {
            if(sentence.substring(i, i+6).contains("python")){
                counterOfPython++;
            }
        }
        System.out.println(counterOfJava==counterOfPython);



    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to
the number of appearances of "python" anywhere in the string (case sensitive).

Example:
input: We study java not python
output: true
 */