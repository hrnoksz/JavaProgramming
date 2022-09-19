package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); // 121, concatenation

        System.out.println(10 + 20); // 30, Addition
        System.out.println(100 -50); // 50, subtraction
        System.out.println(10 * 6);  // 60, multiplication

        System.out.println(100 / 3); // 33
        System.out.println(10.0 / 4);  // 2.5
        System.out.println(10 / 4.0); // 2.5
        System.out.println(10d / 4); //2.5 d stands for decimal

        int a = 100;
        double b = a/6;
        System.out.println(b); // 16.0
        // double b =

        double c = a/6.0; //16.66666
        System.out.println(c);

        System.out.println(100D); //100.0

        System.out.println(10%4); // 2
        System.out.println(20%4); // 0
        System.out.println(20%6); // 2


        System.out.println(5+10+"cydeo"); //15cydeo
        System.out.println("cydeo"+5+10); //cydeo510



    }
}
/*
    +: Addition
    -: Subtraction
    *: Multiplication
    /: Division

            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal

            in math:
                10/4 = 2.5
                100/3 = 33.3333

            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder

            in Math:
                10 / 4 = 2.5

                remainder: numerator - (denominator * integer result)
                                10   -  (4 * 2)
                                10   -   8
                                2
 */