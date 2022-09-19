package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Aygun", 22, 'F', 'A', "Cydeo");

        System.out.println(student1); //Student{name='Aygun', age=22, gender=F, grade=A, schoolName='Cydeo'}

        student1.setName("Harun");
        student1.setGender('M');
        student1.setGrade('A');
        student1.setSchoolName("MIT");
        student1.setAge(39);

        System.out.println(student1); //Student{name='Harun', age=39, gender=M, grade=A, schoolName='MIT'}
    }
}
