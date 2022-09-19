package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester = new Tester("Harun", 48, 'M', 11, "QA", 120000);

        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 150000);

        Teacher teacher = new Teacher("Muhtar", 32, 'M', 12, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(teacher);
        System.out.println(student);

        developer.setAge(39);

        System.out.println(developer.getAge()); //39

        System.out.println(developer);

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("----------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("-----------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();

        System.out.println("-----------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("--------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();


    }
}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student
            test all the functions of each objects

            Analyze the relationships between the classes
 */