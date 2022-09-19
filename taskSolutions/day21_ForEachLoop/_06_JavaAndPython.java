package day21_ForEachLoop;

import java.util.Arrays;

public class _06_JavaAndPython {

    public static void main(String[] args) {

        String sentence = "Java, java, python, Python, java, JAVA";
        sentence = sentence.replace(",", "");

        String[] array = sentence.split(" ");

        int countJava = 0,
                countPython = 0;
        for (String word : array) {
            if(word.equalsIgnoreCase("java")){
                countJava++;
            }
            if(word.equalsIgnoreCase("python")){
                countPython++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */