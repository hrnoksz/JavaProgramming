package day35_Encapsulation;

public class SquareObject {

    public static void main(String[] args) {

        Square square1 = new Square(5);
        System.out.println(square1);
        square1.setSide(4);
        System.out.println(square1);

        Square square2 = new Square(8);
        System.out.println(square2.getSide());
        square2.setSide(10);
        System.out.println(square2);
    }
}
