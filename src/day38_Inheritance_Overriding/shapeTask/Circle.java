package day38_Inheritance_Overriding.shapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Invalid radius "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double area() {
        return pi * radius * radius;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Circle
	r
	pi

	toString(): name, r, pi, area, perimeter
 */
