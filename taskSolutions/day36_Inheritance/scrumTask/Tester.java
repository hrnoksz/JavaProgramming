package day36_Inheritance.scrumTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }
}
/*
3. Create a subclass of Employee named Tester:

	Add any extra variable or method that Tester object need to have
 */