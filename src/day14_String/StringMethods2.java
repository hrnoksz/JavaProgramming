package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        // replace() method:

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); //Python is fun, I love learning Java

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email ="JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("newEmail = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace("Python", "").replace("   ", " ");
        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");
        //s2 = s2.replace("C# is c", "Java is c");
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3); //Jeve

        System.out.println("------------------------------------");

        // replaceFirst():

        String result = "Java Java Java";
        result = result.replaceFirst("Java","Python");
        System.out.println(result); // Python Java Java

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2); //Java is fun, C# is cool

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o");
        System.out.println(result3); //Jova

        String result4 = "Java";
        result4 = result4.replaceFirst("va", "vo");
        System.out.println(result4); // Javo




    }
}
