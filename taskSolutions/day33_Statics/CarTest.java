package day33_Statics;

public class CarTest {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corola", "Gray", 2021, 35000);

        System.out.println(car);

        car.drive();

    }
}
