package day13_String;

public class Practice {

    public static void main(String[] args) {

        //charAt() method

        String str = "wooden spoon";
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length()-1);
        System.out.println(firstLetter);

        // length()
        int length = str.length();
        System.out.println(length);

        // indexOf()
        int s = str.indexOf("s");
        System.out.println(s);
        int o = str.indexOf("o");
        System.out.println(o);
        int thirdO = str.indexOf("oon");
        System.out.println(thirdO);
        int thirdO1 = str.indexOf("po")+1;
        System.out.println(thirdO1);
        int fourthO = str.indexOf("on");
        System.out.println(fourthO);
        int fourth = str.lastIndexOf("o");
        System.out.println(fourth);

        // replace():
        str = str.replace("wooden", "golden");
        System.out.println(str);

        str = str.replaceFirst("o","x");
        System.out.println(str);

        str = str.replaceAll("o", "z");
        System.out.println(str);

        // substring method();

        String str1 = "mike_smith@gmail.com";
        String firstName = str1.substring(0,str1.indexOf("_"));
        System.out.println("First name: "+ firstName);
        String lastName = str1.substring(str1.indexOf("_")+1, str1.indexOf("@"));
        System.out.println("lastName = " + lastName);
        String domain = str1.substring(str1.indexOf("@")+1, str1.lastIndexOf("."));
        System.out.println("domain = " + domain);

        String str2 = str1.substring(1);
        System.out.println(str2);

        // repeat() method:
        String str3 = "Cydeo ";
        str3 = str3.repeat(4);
        System.out.println(str3);

        // toLowerCase()
        String str4 = "WOODEN SPOON";
        str4 = str4.toLowerCase();
        System.out.println(str4);

        // contains() method;

        String str5 = "Java is my favorite programming language";
        str5 = str5.toLowerCase();
        boolean hasJava = str5.contains("java");
        System.out.println(hasJava); //true

        // equals() and equalsIgnoreCase() method;

        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true



    }
}
