package _05_Arrays;

import java.util.Scanner;

public class _005_022_Arrays_PrintShortestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        int minIndex = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].length()<str[minIndex].length()){
                minIndex = i;
            }
        }
        System.out.println(str[minIndex]);
    }
}
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace

output: red
 */