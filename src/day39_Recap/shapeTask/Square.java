package day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side); //here we write "setSide(side)" instead of "this.side=side" in order to
                       //check the condition (if(side <= 0)) that we write within setter method
    }
    @Override
    public double area(){
        return side * side;
    }

    @Override
    public double perimeter(){
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the field
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */