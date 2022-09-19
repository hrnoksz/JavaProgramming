package week05;

public class ElementaryStudentTest {

    public static void main(String[] args) {

        ElementaryStudent student = new ElementaryStudent();


        try {
            student.setName("Max");
            student.setAge(1); // will throw an exception
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(student); //ElementaryStudent{name='Max', age=0}
        System.out.println("Some more executions");
        System.out.println("Some more executions");
        System.out.println("Some more executions");
        System.out.println("Some more executions");
        System.out.println("Executions completed");

    }
}
