package day35_Encapsulation.encapsulation;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println(circle1);

        System.out.println(circle1.getRadius());

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        double area = circle2.calcArea();
        System.out.println(area);

        double perimeter = circle2.calcPerimeter();
        System.out.println(perimeter);
    }
}
