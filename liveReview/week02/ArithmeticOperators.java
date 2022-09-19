package week02;

public class ArithmeticOperators {
    public static void main(String[] args) {

        /*
        Division
        * in math 10/3 = 3.3333
        * in Java 10/3 = 3 reason int/int = int;
        * 10/3.0 int / double = double
        * 10.0/3 double/int = double;
        * 10.0/3.0 double/double = double;
         */

        System.out.println("10 / 3 : " + (10/3));
        System.out.println("10 / 3.0 : " + (10/3.0));
        System.out.println("10 + 3 : " + 10 + 3); // 10 + 3 : 103 concatenation

        // which operations come first in JAVA
        // parenthesis comes first, division, multiplication is before concatenation

        // IMPORTANT : Java runs from top to bottom and left to right

        int num1 = 10;
        double num2 = 3.0;
        int result = (int)(num1/num2);
        System.out.println("result = " + result);



    }
}
