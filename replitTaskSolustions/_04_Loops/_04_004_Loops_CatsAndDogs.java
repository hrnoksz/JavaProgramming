package _04_Loops;

import java.util.Scanner;

public class _04_004_Loops_CatsAndDogs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        int countOfCats = 0;
        int countOfDogs = 0;
        for (int i = 0; i <= word.length()-3; i++) {
            if(word.substring(i, i+3).toLowerCase().contains("cat")){
                countOfCats++;
            }else if(word.substring(i, i+3).toLowerCase().contains("dog")){
                countOfDogs++;
            }
        }
        System.out.println(countOfCats==countOfDogs);
    }
}
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true

Example:

input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */