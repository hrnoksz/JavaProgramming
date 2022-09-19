package day15_ForLoop;

public class _05_DigitsLettersSpecialCharacters {

    public static void main(String[] args) {

        String str = " mn@#123Ab!";
        String alphabet = "";
        String digit ="";
        String special = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
               alphabet += ch;
            }else if (ch >= '0' && ch <= '9'){
                digit += ch;
            }else{
               special += ch;
            }
        }
        System.out.println("letters: " + alphabet);
        System.out.println("digits: " + digit);
        System.out.println("special chars: " + special);


    }
}
/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */