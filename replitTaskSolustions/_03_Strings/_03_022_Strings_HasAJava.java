package _03_Strings;

import java.util.Scanner;

public class _03_022_Strings_HasAJava {

    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();

        exists = word.startsWith("java") || word.substring(1).startsWith("java");
        System.out.println(exists);

    }
}
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython
output: true

input: cjavac++
output: true

input: c#javaruby
output: false
 */