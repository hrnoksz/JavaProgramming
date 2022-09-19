package day23_CustomMethods_Void;

public class _06_CalculateCircle {

    public static void main(String[] args) {

        areaOfCircle(3.2);

    }
    public static void areaOfCircle(double radius){
        double area = radius * radius * 3.14;
        System.out.println("Area of the circle is= " + area);
    }
}
