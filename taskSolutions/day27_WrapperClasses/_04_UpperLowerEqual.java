package day27_WrapperClasses;

public class _04_UpperLowerEqual {

    public static void main(String[] args) {

        String str = "JAVA java";

        int counterUpper = 0;
        int counterLower = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isUpperCase(each)){
                counterUpper++;
            }
            if(Character.isLowerCase(each)){
                counterLower++;
            }
        }
        System.out.println(counterUpper==counterLower); // true

    }
}
/*
4. Write program that returns true if the total number of upper case characters are equal to
   total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */