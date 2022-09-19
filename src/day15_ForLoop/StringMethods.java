package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        // isEmpty() method: returns boolean

        String str = " ";
        // String str = "";  ""==> empty string
        boolean r = str.isEmpty();
        System.out.println(r); // false

        // isBlank() method: returns boolean

        boolean r1 = str.isBlank();
        System.out.println(r1); // true ==> If there is only spaces without characters means blank.
        // when string is empty, str.isEmpty()==> returns true
        //                       str.isBlank()==> returns true

        String str2 = "Cydeo           ";
        System.out.println(str2.isBlank()); // false

        System.out.println("-------------------------------");

        // equalsIgnoreCase() method:
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        System.out.println("yEs".equals("Yes")); // false
        System.out.println("yEs".equalsIgnoreCase("Yes")); // true

        System.out.println("------------------------------------");

        // contains() method:

        String sentence = "My favorite programming language is Java";
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasJava); // true
        System.out.println(hasJava2);// false ==> case-sensitive
        System.out.println(hasJava3); // true

        boolean hasCSharp = sentence.contains("C#");
        System.out.println(hasCSharp); // false

        System.out.println("-------------------------------------");
        String input1 = "I love jAvA";
        String input2 = "Java";
        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains(input2)); // false
        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("---------------------------------");
        // startsWith() method: returns boolean
        String a = "Wooden Spoon";
        boolean x = a.startsWith("W");
        boolean x1 = a.startsWith("Woo"); // we can use this method for more than one character
        boolean x2 = a.startsWith("w");
        boolean x3 = a.toLowerCase().startsWith("wooden"); // or
        boolean x4 = a.toUpperCase().startsWith("WOODEN");
        // in order to ignore the case sensitivity we first create the lower case/ upper case version of String and then
        //compare it with lowercase/uppercase
        System.out.println(x); // true
        System.out.println(x1); // true
        System.out.println(x2); // false==> because case-sensitive
        System.out.println(x3); // true
        System.out.println(x4); // true
        System.out.println("------------------------------------------");

        // endsWith() method:
        boolean y = a.endsWith("Spoon");
        boolean y1 = a.endsWith("n");
        boolean y2 = a.endsWith("N");
        boolean y3 = a.toLowerCase().endsWith("spoon");
        boolean y4 = a.toUpperCase().endsWith("SPOON");

        System.out.println(y); // true
        System.out.println(y1); // true
        System.out.println(y2); // false ==> case-sensitive
        System.out.println(y3); // true
        System.out.println(y4); // true
    }
}
