package day36_Inheritance.employeeTask;

public class Teacher extends Employee {

    public void work(){
        System.out.println(jobTitle+" "+name+" is teaching");
    }


}
/*
2.4 Create the subclass of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching
				toString()
 */