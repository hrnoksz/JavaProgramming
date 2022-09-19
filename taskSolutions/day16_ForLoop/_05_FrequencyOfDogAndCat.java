package day16_ForLoop;

import java.util.Scanner;

public class _05_FrequencyOfDogAndCat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = scan.nextLine();

        int counterCat = 0,
                counterDog = 0;

        for (int i = 0; i <= sentence.length()-"cat".length() ; i++) {
            if (sentence.substring(i,i+"cat".length()).equalsIgnoreCase("cat")){
                counterCat++;
            }else if(sentence.substring(i,i+"dog".length()).equalsIgnoreCase("dog")){
                counterDog++;
            }
        }

        if (counterCat == counterDog){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        scan.close();
    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */