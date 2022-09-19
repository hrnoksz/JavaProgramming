package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _005_017_Arrays_CopyCertainValues {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("e")){
                count++;
            }
        }
        int i = 0;
        String[] fewValue = new String[count];
        for (int j = 0; j < arr.length; j++) {
          if(arr[i].contains("e")){
              fewValue[j] = arr[i];
              i++;
          }
        }
        System.out.println(Arrays.toString(fewValue));




    }

}

/*
Finish the getWithE. Given a String array arr with the following elements

["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter e in them

You need to know how many element contain e and create array accordingly

Values in fewValues array need to be ["zero", "one","three"]

Examples:

arr -> ["aa", "be", "lol", "lel", "oreo"]
fewValues -> ["be",  "lel", "oreo"]

arr -> ["e", "hey", "bye", "fury", "spoon"]
fewValues ->["e", "hey", "bye"]
 */