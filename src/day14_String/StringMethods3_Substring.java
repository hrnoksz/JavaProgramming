package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //substring(beginning index, ending index) method:

        String word = "Cydeo School";
        //             0123456
        String brand = word.substring(0,4+1);
        System.out.println(brand); //Cydeo

        String str1 = word.substring(6);
        System.out.println(str1); //School
        System.out.println("--------------------------------");
        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" "));
        String s2 = word2.substring(word2.indexOf(" ") + 1, word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.lastIndexOf(" ") + 1);

        System.out.println(s1); //Java
        System.out.println(s2); //Programming
        System.out.println(s3); // Language


    }
}
