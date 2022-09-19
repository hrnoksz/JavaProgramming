package day38_Inheritance.employeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle) {
        super(name, age, gender, id, jobTitle);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }
}
