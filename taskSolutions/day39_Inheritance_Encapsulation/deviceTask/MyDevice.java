package day39_Inheritance_Encapsulation.deviceTask;

public class MyDevice {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "Ipone 11 pro max", "Black", "Medium", 145.50);

        System.out.println(iphone);

        iphone.faceTime("harun1973@yahoo.com");
        iphone.faceTime(123456789);

    }
}
