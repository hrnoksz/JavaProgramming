package day14_String;

public class StringMethods4{

    public static void main(String[] args) {

        // repeat() method

        String str = "Cydeo";
        str = str.repeat(4);
        System.out.println(str); //CydeoCydeoCydeoCydeo

        String s1 = "Wooden Spoon";
        s1 = s1.repeat(25);
        System.out.println(s1);

        System.out.println("------------------------------------");

        System.out.println("FADY\n".repeat(15));

        System.out.println("------------------------------------");

        String name = "Java";

        System.out.println(name.repeat(5)); //JavaJavaJavaJavaJava

        System.out.println("--------------------------------");

        String name1 = "Java";
        System.out.println((name1 +" ").repeat(5)); // Java Java Java Java Java

    }
}
