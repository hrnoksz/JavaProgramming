package day38_Inheritance.employeeTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, String jobTitle) {
        super(name, age, gender, id, jobTitle);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is facilitating meetings");
    }
}
