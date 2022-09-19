package day27_WrapperClasses;

public class _05_WrapperClassMethod {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); // returns int

        System.out.println(num + 1); //124
        System.out.println(str + 1); //1231 ==> 123 and 1 are concatenated.

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2); //10.5
        System.out.println(num2+1); //11.5

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max = " + max); //max = 2147483647
        System.out.println("min = " + min); //min = -2147483648

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println("max2 = " + max2); //max2 = 9223372036854775807
        System.out.println("min2 = " + min2); //min2 = -9223372036854775808

        String s1 = "true";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1); // true

        String s2 = "maybe"; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        boolean r2 = Boolean.parseBoolean(s2);
        System.out.println(r2); // false !!!!!!!!!!!!!!!!!!!

        System.out.println("----------------------------------");

        String s3 = "123";
        Integer x = Integer.valueOf(s3); //Integer
        int y = Integer.valueOf(s3); //Integer
        System.out.println(x); //123
        System.out.println(y); //123

        String s4 = "1.5";
        Double z = Double.valueOf(s4); //Double
        System.out.println(z); //1.5

        System.out.println("----------------------------------");

        //isDigit()
        char ch1 = '0';
        boolean r3 = Character.isDigit(ch1);
        System.out.println(r3); // true

        //isLetter()
        char ch2 = 'A';
        boolean r4 = Character.isLetter(ch2);
        System.out.println(r4); //true

        //special char
        boolean r5 = !Character.isLetterOrDigit(ch1);
        System.out.println(r5); //false

        //upperCase
        boolean r6 = Character.isUpperCase(ch2);
        System.out.println(r6); // true

        //lowerCase
        boolean r7 = Character.isLowerCase(ch2);
        System.out.println(r7); //false

        System.out.println("-----------------------------------");

        String s = "ab1cde2ef3hi4";

        int sum = 0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+ each);
            }
        }
        System.out.println(sum); // 10

    }
}
