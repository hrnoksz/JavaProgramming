package week03_Casting;

public class Casting {

    public static void main(String[] args) {

        /*
Primitives:

    double > float > long > int > short > byte

    implicit casting: smaller primitives can be directly assigned to larger primitive type
    explicit casting: larger primitives can NOT be directly assigned to smaller primitive types (need to be casted manually)
*/

 /*When byte and short data types are used in arithmetic operations, they
                                are evaluated as int data type temporarily.
       */
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); //how to handle
        int abc=a+b;
        System.out.println("------------------------------------------------------------");

        /*Java always understands;
                whole   numbers as int 10 15 3
                decimal numbers as double 4.6
         */
        // () * / % + -
        System.out.println(10.0/3); //3.333333
        System.out.println(4+17%2-1); //4
        System.out.println(6-3*2+7-1); //6
        System.out.println(8+12/(6-1));//8+2 10

        //always gives the result as the same data type with "bigger data type"
        long x = 324l;
        int y = 12;
        long result =  (x + y);
        System.out.println( (int) (7.9) + (int) (6.7));
        //7+6 13
        System.out.println( (int) (7.9 + 6.7));
        //14
        System.out.println((double)(17));
        //17.0
        double d=16; //16.0 implicit casting
        System.out.println((double)(8+3));
        //11.0
        System.out.println((double)(7)/2);
        //7.0/2  3.5
        System.out.println((double)(7/2));
        //3.0
        System.out.println((int)(7.8+(double) (15)/2));
        //(int)(7.8+15.0/2)
        //(int)(7.8+7.5)  15.3
        //15


    }
}
