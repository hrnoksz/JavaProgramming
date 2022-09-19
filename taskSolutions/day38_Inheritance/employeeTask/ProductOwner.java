package day38_Inheritance.employeeTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, String jobTitle) {
        super(name, age, gender, id, jobTitle);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is gathering requirements");
    }
}
