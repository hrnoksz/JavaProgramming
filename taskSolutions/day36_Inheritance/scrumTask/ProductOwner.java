package day36_Inheritance.scrumTask;

public class ProductOwner extends Employee {


    public ProductOwner(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void gather(){
        System.out.println(getJobTitle()+" "+getName()+" is gathering requirements");
    }
}
/*
6. Create a subclass of Employee named ProductOwner:

			Add any extra variable or method that ProductOwner object need to have
 */
