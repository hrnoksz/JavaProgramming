package day23_CustomMethods_Void;

public class _16_NameFormat {

    public static void main(String[] args) {

        fullName("cYdeO", "SChool");
    }
    public static void fullName(String firstName, String lastName){

        firstName = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
/*
16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */