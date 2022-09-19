package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {

    public static void main(String[] args) {

         byte a = 100;
         short b = a;
         //short b = (short)a; // this is done automatically by compiler
         //  (short)a  ()--> casting operator

        int c = b; // implicit casting

        long d = c;

        float e = d;

        double f = e;
        System.out.println(f);

        System.out.println("-----------------------------------------------------");

        int x = 55;
        short y = (short) x; // explicit casting which be used to cast larger primitives to the smaller primitives
                            // need to cast manually
                            // (you cannot pour a gallon of milks to a bottle)

        System.out.println(x + " : " + y);

        long j = 1000000L;
        short k = (short)j;

        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;
        System.out.println(n + " : " + s); // output 10

        System.out.println("----------------------");
        // shortcut for explicit casting Alt + hit enter
        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + " : " + s1); // output 20


        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1); // output 20



    }

}
