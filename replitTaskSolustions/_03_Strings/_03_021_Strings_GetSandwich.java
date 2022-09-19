package _03_Strings;

import java.util.Scanner;

public class _03_021_Strings_GetSandwich {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        if(str.indexOf("bread") != str.lastIndexOf("bread")){
            System.out.println(str.substring(str.indexOf("bread")+ ("bread").length(), str.lastIndexOf("bread")));
        }else{
            System.out.println("nothing");
        }

    }
}
/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string,
or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam
 */