package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160; Because of 160 is out of byte's range, there is a compile error.
        short weight = 160; // 160 is within the range of short

        // salary: 100000 $
        // short salary = 100000; 100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers

        // int asset = 3_333_333_333; this number is out of int' range.

        long asset = 3_333_333_333L; // we should add L or l the end of data to take as long type

        // tax: 0.26
        float tax = 0.26F;

        double PI = 3.14; // double is the preferred data type for decimal numbers

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender ='F';

        char grade = 'B';

        char yesNo = 'Y';
        System.out.println(yesNo);

        boolean isEmployed = true;
        System.out.println("isEmployed = " + isEmployed);
        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);

        boolean result = 100 > 300 ;
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        System.out.println("name = " + name);

        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        String first_name$ = "Muhtar";
        String _lastName = "Resit";
        String $city = "Ankara";
    }

}
