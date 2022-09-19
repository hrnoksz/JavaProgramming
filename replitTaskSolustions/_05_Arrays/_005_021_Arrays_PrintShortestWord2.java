package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _005_021_Arrays_PrintShortestWord2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");
        Arrays.sort(words);

        int min = words[0].length();
        String output = "";

        for (String each : words){

            if (min > each.length()){
                output = each + " ";
                min=each.length();
            }else if (min==each.length()){
                output+=each + " ";
            }
        }

        String[] result = output.trim().split(" ");
        System.out.println(Arrays.toString(result));

    }
}
/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */