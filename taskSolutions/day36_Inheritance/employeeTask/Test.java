package day36_Inheritance.employeeTask;

public class Test {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Harun", 'M', 48, 1111, "QA", 120000);

        Developer developer = new Developer();
        developer.setInfo("Muhtar", 'M', 35, 1234, "Java Developer", 200000);

        Driver driver = new Driver();
        driver.setInfo("Mert", 'M', 23, 1235, "Truck Driver", 90000);

        Teacher teacher = new Teacher();
        teacher.setInfo("Asya", 'F', 28, 1236, "Softskill Teacher", 140000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        System.out.println(teacher.jobTitle);

        tester.createTicket();

        developer.fixingBugs();

        teacher.work();

        driver.driving();


    }
}
