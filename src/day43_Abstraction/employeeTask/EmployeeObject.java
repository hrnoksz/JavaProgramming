package day43_Abstraction.employeeTask;

public class EmployeeObject {

    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M');
        // We cannot create any objects from ABSTRACT classes!!!!!!!!!!!!!!!!!!!!!!!!!!!

        Tester tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);
        Teacher teacher = new Teacher("Angel", 28, 'F', 34, "English Teacher", 85000.00);
        Driver driver = new Driver("John", 34, 'M', 42, "Truck Driver", 75000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println("----------------------");
        tester.sleep();
        tester.work();
        tester.bugReport();
        tester.eat();
        System.out.println("-------------------");
        developer.sleep();
        developer.work();
        developer.unitTest();
        developer.eat();
        System.out.println("-----------------------");
        teacher.sleep();
        teacher.work();
        teacher.eat();
        System.out.println("---------------------------");
        driver.sleep();
        driver.work();
        driver.eat();
    }
}
