package day35_Encapsulation;

public class RectangleObject {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 8);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getWidth());
        rectangle1.setWidth(6);
        System.out.println(rectangle1);
        System.out.println("-------------------------");
        Rectangle rectangle2 = new Rectangle(3, -1);
        System.out.println(rectangle2);
    }
}
