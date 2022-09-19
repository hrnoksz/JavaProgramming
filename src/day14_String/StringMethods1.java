package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        // trim() method:

        String str1 = "  batch 25    ";
        str1 = str1.trim(); // "batch 25"
        System.out.println(str1);
        System.out.println("----------------------------------------");

        // indexOf() method: reads the character from left to right and returns int

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); // it returns first o index.
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("a ");

        int n4 = str3.indexOf("g"); // first g
        System.out.println("n4 = " + n4); // 8

        int n5 = str3.indexOf("g "); // second g
        System.out.println("n5 = " + n5); //15

        // lastIndexOf(): reads the character from right to left and returns int
        int n6 = str3.lastIndexOf("g"); // last g
        System.out.println("n6 = " + n6); // 23

        System.out.println("---------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava W");
        int fourthA = s.lastIndexOf("av");
        //int fifthA = s.lastIndexOf("va") +1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA); //1
        System.out.println("lastA = " + lastA); // 22
        System.out.println("secondA = " + secondA); // 3
        System.out.println("thirdA = " + thirdA); // 8
        System.out.println("fourthA = " + fourthA); //11
        System.out.println("fifthA = " + fifthA); // 13
        System.out.println("sixthA = " + sixthA); // 16
        System.out.println("seventhA = " + seventhA); // 18

    }
}
