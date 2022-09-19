package day39_Recap.cydeoTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is testing the application");
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }



}
/*
 3. Create a subclass of Employee named Tester
            Override the work method
            Extra methods:
                createTicket()
 */
