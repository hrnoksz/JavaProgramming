package day35_Encapsulation;

public class CybertekStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber, groupNumber;

    public static String schoolName;
    public String fieldsOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CybertekStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldsOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldsOfStudy = fieldsOfStudy;
    }

    static {
        schoolName = "CYDEO";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("School is " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Code is " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class.");
    }

    public void study(){
        System.out.println(name + " is studying.");
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldsOfStudy='" + fieldsOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName(); static method
                printSecretCode(); static method
                attendClass(): instance met
                study(): instance
                toString()

 */