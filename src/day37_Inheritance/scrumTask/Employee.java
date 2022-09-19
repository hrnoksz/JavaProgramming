package day37_Inheritance.scrumTask;

public class Employee extends Person { //Employee IS A Person

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
2. Create a subclass of Person named Employee
			Extra variables:
				id, jobTitle, salary, companyName

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class,
							you can call the inherited setInfo() to set the name, age, and gender

				work()
				toString(): generate toString separately in Employee class so that name, age, gender, id,
				jobTitle and salary of the employee can be displayed
 */