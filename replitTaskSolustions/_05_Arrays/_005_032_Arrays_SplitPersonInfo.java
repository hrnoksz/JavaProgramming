package _05_Arrays;

import java.util.Scanner;

public class _005_032_Arrays_SplitPersonInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        person(s);
    }
    public static void person(String info){
        String[] arr = info.split(",");
        System.out.println("person name: " +arr[0] + "\nlast name: " +arr[1] + "\nage: " + arr[2]);
    }
}
/*
The method person has a string arguement with this format: "name,last name,age". Print out the person's information

Example:

person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
person("jon,doe,30");


hint: use the split method to split the string to a string array where there is a "," char
 */