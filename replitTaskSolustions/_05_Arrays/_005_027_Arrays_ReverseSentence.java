package _05_Arrays;

import java.util.Scanner;

public class _005_027_Arrays_ReverseSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");

        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i]+" ";
        }
        reversed = reversed.trim();
        System.out.println(reversed);
    }
}
/*
Given a String variable sentence, write code to get each word and
assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */