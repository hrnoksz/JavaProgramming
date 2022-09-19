package _02_Statements;

import java.util.Scanner;

public class _2_001_Statements_GreaterNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>b){
            System.out.println(a + " is greater");
        }else{
            System.out.println(b + " is greater");
        }
    }
}
/*
Use an if statement to determine if a or b is bigger. Then print:
$number is greater
Examples:
        a=1
        b=2
output:
        2 is greater

        a=5
        b=7
output:
        7 is greater
 */