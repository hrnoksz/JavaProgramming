package day33_Statics;

public class CircleTest {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
    }
}
