package week05;

public class ElementaryStudent {

    private String name;
    private int age;

    public ElementaryStudent(){

    }

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new RuntimeException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 5 || age > 12){
            throw new RuntimeException("Age cannot be less than five or greater than 12");
        }
        this.age = age;
    }

    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
