package day38_Inheritance_Overriding.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        Square square = new Square(5);

        Rectangle rectangle = new Rectangle(5,4);

        System.out.println(circle);
        System.out.println(circle.getName());
        System.out.println(circle.getRadius());
        System.out.println("----------------------------------------");
        System.out.println(square);
        System.out.println(square.getName());
        System.out.println(square.getSide());
        System.out.println("----------------------------------------");
        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println("----------------------------------------------");
        circle.area();
        rectangle.area();
        square.area();
        System.out.println("--------------------------------------------");
        circle.perimeter();
        rectangle.perimeter();
        square.perimeter();

    }
}
