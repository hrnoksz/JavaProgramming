package _03_Strings;

import java.util.Scanner;

public class _03_016_Strings_AlejandroI {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        scan.close();
        String result = "";
        if(email.contains("alejandro")){
            result = "read";
        }else{
            result = "don't read";
        }
        System.out.println(result);


    }
}
/*
Alejandro has many emails and only has time to read the emails that refer to him.
Check if his name is found in the email and if it does print "read",
but if his name is not in the email print "don't read"

Examples:
a = "dear alejandro.....alot of text"
output: "read"
 */