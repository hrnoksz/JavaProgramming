package day38_Inheritance.employeeTask;

public class CydeoInc {

    public static void main(String[] args) {

        Developer developer = new Developer("Muhtar", 29, 'M', 1010, "Developer");

        System.out.println(developer);

        developer.work();

        Tester tester = new Tester("Harun", 48, 'M', 1111, "QA Leader");

        System.out.println(tester);

        tester.work();

    }
}
