package day27_WrapperClasses;

public class _03_LetterDigitSpecialChar {

    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        String letters = "";
        String specialChar = "";
        String digit = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isLetter(each)){
                letters += each;
            }else if(Character.isDigit(each)){
                digit += each;
            }else{
                specialChar += each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
        System.out.println("specialChar = " + specialChar);

    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */