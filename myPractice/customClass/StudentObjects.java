package customClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Aygun", 'F', 39, 2210, 'A');

        student1.study();

        Student student2 = new Student("Hulya", 'F', 26, 2123, 'B');

        Student student3 = new Student("Elminur", 'F', 26, 2215, 'A');

        Student student4 = new Student("Ali", 'M', 28, 5511, 'B');

        Student student5 = new Student("Mert", 'M', 26, 2252, 'C');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);

        System.out.println(angryBirds);

        System.out.println("-------------------------------------------");

        ArrayList<Student> femaleStudents = new ArrayList<>();
        ArrayList<Student> maleStudents = new ArrayList<>();

        for (Student each : students) {
            if(each.gender == 'F'){
                femaleStudents.add(each);
            }else{
                maleStudents.add(each);
            }
        }
        System.out.println(femaleStudents);
        System.out.println(maleStudents);
    }
}
