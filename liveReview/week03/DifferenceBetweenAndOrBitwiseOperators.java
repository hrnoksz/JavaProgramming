package week03;

public class DifferenceBetweenAndOrBitwiseOperators {

    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 10;

        System.out.println(true | false); // true, check both sides
        System.out.println(true || false);// true again, but does not check the second part of the statement if the
        // first part is already true

        System.out.println(i2>i1 | i1>i2); // true

        System.out.println(i2>i1 || ++i1>i2); // if first part is true, then compiler do not check second part
        System.out.println("i1 = " + i1); // 5

        //boolean a = i1<i2 && i2<i1; // true && false ==> return false, because && operator check both statement
        //System.out.println("a = " + a);

        boolean a = i2<i1 && ++i1<i2; // Bitwise and operator: if the first statement
        // is false, DOES NOT check the second statement
        System.out.println("a1 = " + a);
        System.out.println("i1 = " + i1); // 5
    }
}
