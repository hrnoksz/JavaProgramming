package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);
        square.setSide(15);
        System.out.println(square);
        /*
        square.setSide(0.0);
        System.out.println(square); //Invalid side: 0.0
        */

        /*
        Circle circle1 = new Circle(-1);
        System.out.println(circle1); //Invalid radius: -1.0
        */

        System.out.println("----------------------------------");

        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println(rectangle); //Rectangle{length=5.0, width=6.0, area=30.0, perimeter=22.0}

        rectangle.setLength(10);

        System.out.println(rectangle.getLength()); // 10.0

        System.out.println(rectangle); //Rectangle{length=10.0, width=6.0, area=60.0, perimeter=32.0}

        System.out.println(rectangle.getName()); //Rectangle

        System.out.println("-------------------------------------");

        Circle circle = new Circle(5);

        System.out.println(circle); //Circle{radius=5.0, pi=3.14, area=78.5, perimeter=31.400000000000002}

        circle.setRadius(10);

        System.out.println(circle.getRadius()); //10

        System.out.println(circle); //Circle{radius=10.0, pi=3.14, area=314.0, perimeter=62.800000000000004}

        System.out.println(circle.getName()); //Circle
    }
}
