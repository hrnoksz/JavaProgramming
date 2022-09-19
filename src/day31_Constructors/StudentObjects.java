package day31_Constructors;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Hulya", 26, 'F', 'B', 13);

        Student student2 = new Student("Ali", 30, 'M', 'A', 42);

        Student student3 = new Student("Aysen", 45, 'F', 'A', 11);

        Student student4 = new Student("Harun", 48, 'M', 'A', 22);

        Student[] students = {student1, student2, student3, student4};

        ArrayList<Student> studentList = new ArrayList<>();
        for (Student each : students) {
            studentList.add(each);
        }
        System.out.println(studentList);

        ArrayList<Student> gradeWithA = new ArrayList<>(studentList);
        gradeWithA.removeIf(p-> !(p.grade == 'A'));
        System.out.println(gradeWithA);


        ArrayList<Student> maleList = new ArrayList<>(studentList);
        maleList.removeIf(p->!(p.gender=='M'));
        System.out.println(maleList);
    }
}
