package day38_Inheritance_Overriding.shapeTask;

public class Square extends Shape {

    private double side;

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side <= 0){
            System.err.println("Invalid side " + side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double area() {
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Square
	s
	toString(): name, s, area, perimeter
 */
