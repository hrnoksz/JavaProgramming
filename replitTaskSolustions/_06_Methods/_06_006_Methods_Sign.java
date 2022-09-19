package _06_Methods;

import java.util.Scanner;

public class _06_006_Methods_Sign {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sign(n);
    }
    public  static void sign(int n){
        String result = "";
        if(n>0){
            result = "positive";
        }else if(n<0){
            result = "negative";
        }else{
            result = "zero";
        }
        System.out.println(result);
    }
}
/*
Given a method sign write the code so that its takes a number arguement and tells you if its positive, negative or zero.

for example :

sign(5)  => positive

sign(-30) => negative

sign(0)  => zero
 */