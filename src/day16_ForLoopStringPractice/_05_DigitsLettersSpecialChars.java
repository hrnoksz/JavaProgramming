package day16_ForLoopStringPractice;

public class _05_DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@# $%WoodenSpoon";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // ch: each character that we have in str
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                letters += ch;
            }else if (ch >= '0' && ch <= '9'){ // if the character is between '0' and '9' then it's digit
                digits += ch;
            }else{ // if the character is neither digit nor letter, then it's special character
                if(ch != ' '){ // if the special character is not a space
                    specialChars += ch;
                }

            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
