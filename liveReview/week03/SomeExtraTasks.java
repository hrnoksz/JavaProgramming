package week03;

public class SomeExtraTasks {
    public static void main(String[] args) {

        int b = 2;

        boolean res = ++b == 2 || --b == 2 && --b == 2; // false (b:3), 2 == 2 (true)==> first part true && second part
                                                        // b:1 is not equal to 2 ==> false
                                                        // true && false ==> return FALSE

        System.out.println(res); // false

    }
}
