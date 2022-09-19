package day38_Inheritance.employeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle) {
        super(name, age, gender, id, jobTitle);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing bugs");
    }
}
