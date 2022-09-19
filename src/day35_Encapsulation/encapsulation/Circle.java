package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius <= 0){
            return; // in order to exit methods
        }
        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return 2 * pi * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the radius of circle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */