package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) { // Constructors' name must be same with classnames
        this.name = name;
    }

    public String getName() { // We can use GETTER method only for final variables, we cannot use SETTER method for final variable(s)
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'';
    }
}
