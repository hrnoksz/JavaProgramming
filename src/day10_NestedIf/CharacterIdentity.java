package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = 65;

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabetic");
        } else {
            System.out.println("Special character");
        }

    }
}
/*
Create a class called Character Identity, and write a program that can identify if the given character is a digit
or Alphabetic Character(A~Z or a~z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may want to check out the numbers of the characters on ASCII table


 */