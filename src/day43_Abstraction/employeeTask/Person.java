package day43_Abstraction.employeeTask;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new RuntimeException("Invalid name: " + getName());
        }
        if(name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid name: " + getName());
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("Invalid age: " + getAge());
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        gender = (""+gender).toUpperCase().charAt(0);
        if(!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender: " + getGender());
        }
        this.gender = gender;
    }

    public abstract void sleep();

    public void eat(){
        System.out.println(name+" is eating baklava");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
