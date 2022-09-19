package day15_ForLoop;

public class _07_ReverseWord {

    public static void main(String[] args) {
        
        String word = "Wooden Spoon";
        String result = "";

        for (int i = word.length()-1; i >= 0; i--) {
            result += word.charAt(i);
        }
        System.out.println("result = " + result);

    }
}
/*
7. Write a program that can reverse any given string

			Ex:
				input: 
					Wooden Spoon

				output:
					noopS nedooW
 */