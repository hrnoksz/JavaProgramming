package day36_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void analyze(){
        System.out.println(getJobTitle()+" "+getName()+" is analyzing the documents");
    }
}

/*
5. Create a subclass of Employee named BusinessAnalyst:

	Add any extra variable or method that BusinessAnalyst object need to have
 */
