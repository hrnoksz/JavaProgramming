package _04_Loops;

import java.util.Scanner;

public class _04_008_Loops_CountJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count = 0;

        for (int i = 0; i <= word.length()-4; i++) {
            String eachSub = word.substring(i, i+4);
            System.out.println(eachSub);
            if(eachSub.equals("java")){
                count++;
            }
        }
        System.out.println(count);

    }
}
/*

 */