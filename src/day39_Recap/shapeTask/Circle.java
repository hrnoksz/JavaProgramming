package day39_Recap.shapeTask;

public class Circle extends Shape {

    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Invalid radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
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
variables:
			radius
			pi (static)
		Encapsulate the field
		Add a constructor to set the field
		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): radius, pi, area, perimeter

 */
