package week03;

public class UnaryReview {

    public static void main(String[] args) {

        int a = 20;
        a++;

        //System.out.println("a++ = " + a++); // 20 post increment use the variable then increase by 1
        System.out.println("a = " + a); // 21

        int b = 20;
        System.out.println("++b = " + ++b); // 21 pre increment; increase by 1 then use the variable

        int c = 20;
        System.out.println(++c + 1); // 21 + 1 = 22

        boolean isMarried = true;
        System.out.println("!isMarried = " + !isMarried); // false, not operator makes true false, false true

        int x = 12;
        if(++x>12){ // pre increment operator
            System.out.println("x in the if statement : " + x); // 13
        }else{
            System.out.println("x value in the ELSE statement : " + x);
        }
        System.out.println("------------------------------");

        int y = 12;

        if(y++>12){ // post increment operator
            System.out.println("y in the if part : " + y);
        }else{
            System.out.println("y value in the ELSE statement : " + y); // 13
        }
    }
}
