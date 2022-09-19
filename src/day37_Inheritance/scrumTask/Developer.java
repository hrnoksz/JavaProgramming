package day37_Inheritance.scrumTask;

public class Developer extends Employee { //Developer IS A Employee, Developer IS A Person

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }


}
/*
4. Create a subclass of Employee named Developer:

	Add any extra variable or method that Developer object need to have
 */