package week03_Operators;

public class Operator {

    public static void main(String[] args) {

        int x = 10;
        x += 1; //x=x+1==>11
        //post increment: use it first, then increase
        System.out.println(x++); //11
        System.out.println(x); //12

        //post decrement: use it first, then decrease
        System.out.println(x--); //12
        System.out.println(x); //11

        System.out.println("----------------------------------");

        int z = 4; //5
        int y = z * 4 - z++;
        //16-4 12
        System.out.println(y);//12
        System.out.println(z);//5
        System.out.println("----------------------------------");

        int a = 50;
        int res = --a + a++ + a-- + a++;
        //         49 + 49 + 50 + 49
        System.out.println("a = " + a);
        System.out.println("res = " + res);

        int k = 25;
        int result2 = k++ + --k;
        //             25 + 25 = 50
        System.out.println("result2 = " + result2);

        int l = 10;
        int result3 = --l + --l + l-- + l--;
        //             9  + 8 + 8 + 7 = 32
        System.out.println("result3 = " + result3);

        int m = 30;
        int result4 = --m + ++m + m-- + m++ + --m + --m + m++;
        //              29 + 30 + 30 + 29 + 29 + 28 + 28 = 203
        System.out.println("result4 = " + result4);

        int n = 20;
        int result5 = n-- + n++ + n++ + --n + n-- + ++n + n++ + n--;
        //             20  + 19  + 20 + 20 + 20 + 20 + 20 + 21
        System.out.println("result5 = " + result5);

        int s = 40;
        int result6 = --s + --s + s-- + s-- + s++ + ++s + s++ + s-- + s--;
        //             39  + 38  + 38  + 37  + 36 + 38  + 38  + 39  + 38
        System.out.println("result6 = " + result6);

        int r = 50;
        int result7 = --r + --r + r-- + r++ + ++r + r-- + --r + r++ + ++r;
        //             49 +  48  +  48 + 47  + 49 + 49  + 47  + 47  + 49;
        System.out.println("result7 = " + result7);
        System.out.println("----------------------------------");

        int b = 2;
        boolean result1 = ++b == 2 || --b == 2 && --b == 2;
        /*               false||true&&false
                         false
         */
        System.out.println(result1);
        System.out.println(b);

        System.out.println("----------------------------------");

        //first one false no need to check the second one
        System.out.println(true && true);  //true
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false);  //false
        // first one true no need check the second one
        System.out.println(true || true);  //true
        System.out.println(true || false);  //true
        System.out.println(false || true);  //true
        System.out.println(false || false);  //false

        System.out.println("----------------------------------");

        // short-circuit
        // &&  -> short-circuit
        // ||  -> short-circuit

        // &  -> no short-circuit
        // |  -> no short-circuit

        int i = 1;

        System.out.println((i > 4) && (++i == 4)); // When we use && logic, if first part is FALSE, second part isn't
                                                   // checked by the compiler.
        System.out.println(i); //1


        //-------------------------------------------

        System.out.println((i > 4) & (++i == 4));//false==> when we use single &, then both of parts are executed.
        System.out.println(i);//2

        System.out.println("----------------------------------");

        int c = 1;

        System.out.println((c > 0) || (++c == 4));//true  == > When we use || logic, if first part is TRUE, second part isn't
                                                             // checked by the compiler.
        System.out.println(c);//1

        //------------------------------------------

        System.out.println((c > 0) | (++c == 4)); // true ===>when we use single |, then both of parts are executed.
        System.out.println(c); // 2

        System.out.println("----------------------------------");

        int d = 2;
        System.out.println(++d == 2 || --d == 2 && --d == 2);
        //                   false  ||  true && false
        System.out.println(d);

        /*

         */

        System.out.println("----------------------------------");

        int e = 2;
        System.out.println(++e == 2 && --e == 2 || --e == 2);
        System.out.println(e);
        /*

         */



    }
}
