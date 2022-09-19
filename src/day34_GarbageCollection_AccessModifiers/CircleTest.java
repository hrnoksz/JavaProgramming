package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*; // import all static members from the class

import static utilities.MathUtility.*;

public class CircleTest {

    public static void main(String[] args) {

        System.out.println(pi); //0.0
        System.out.println(name); //null
        System.out.println(numbers);//null
        /*
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Therefore we do NOT initialize static variables within Circle class or static block,
        outputs on console will be like above.
        But if we initialize static variables within class or static blocks, outputs on console are
        following:
        3.14
        Circle
        [10, 20]
         */

        System.out.println("----------------------------------");

        // find the sum of 10, 20
        int r1 = sum(10,20);

        //find the sum of 100, 200
        int r2 = sum(100,200);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        int r3 = subtract(100, 50);
        System.out.println("r3 = " + r3);

        int r4 = max(1000, 2000);
        System.out.println("r4 = " + r4);
    }
}
