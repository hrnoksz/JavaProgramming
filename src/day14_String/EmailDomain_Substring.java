package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);// gmail

        System.out.println("----------------------------------------");

        String str1 = "Java is fun, Java is cool";

        String s1 = str1.substring(0, str1.indexOf(","));
        System.out.println(s1);//Java is fun

        String s2 = str1.substring(str1.lastIndexOf("J"));
        System.out.println(s2); //Java is cool

        System.out.println("-------------------------------------------");

        String str2 = "Java is fun, Java is cool, I love Java";
        int beginning = str2.indexOf(" J") + 1;
        int ending = str2.lastIndexOf(",");
        String s3 = str2.substring(beginning, ending);
        System.out.println(s3); // Java is cool
        String s4 = str2.substring(str2.lastIndexOf("I"));
        System.out.println(s4); // I love Java
    }
}
/*
Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */