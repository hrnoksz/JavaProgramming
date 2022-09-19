package day36_Inheritance.scrumTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void fixBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing bugs");
    }
}
/*
4. Create a subclass of Employee named Developer:

			Add any extra variable or method that Developer object need to have
 */