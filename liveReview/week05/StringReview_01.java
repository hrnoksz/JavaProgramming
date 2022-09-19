package week05;

public class StringReview_01 {

    public static void main(String[] args) {

        String str1 = "Java"; // literal way of creating
        // string object is created in the HEAP memory, there is a special place called STRING POOL
        String str2 = "Java"; // literal

        System.out.println(str1 == str2); // true: The REASON: both str1 and str2 references are pointing to
                                          // the same object in the memory

        String str3 = new String("Java");
        System.out.println(str1 == str3); // false: The Reason: str1 and str3 are pointing to a different objects
        String str4 = new String("Java"); // over here we are creating totally a new object
        System.out.println(str3 == str4); // false

        //What does equals() method do? It is checking for the value of the object
        System.out.println(str1.equals(str3));// true

        // if you want to check without case sensitivity
        // we use equalIgnoreCase() method

        String str5 = new String("JAVA");
        System.out.println(str1.equalsIgnoreCase(str5)); // true
    }
}
