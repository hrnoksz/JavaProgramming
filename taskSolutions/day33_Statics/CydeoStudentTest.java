package day33_Statics;

public class CydeoStudentTest {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy", 39, 'M', 11, 'A', 8, 16);

        CydeoStudent student2 = new CydeoStudent("Kathy", 29, 'F', 22, 'C', 25, 12);

        System.out.println(student1);
        System.out.println(student2);


        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();






    }
}
