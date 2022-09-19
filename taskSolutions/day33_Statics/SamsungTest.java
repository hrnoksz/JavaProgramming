package day33_Statics;

public class SamsungTest {

    public static void main(String[] args) {

        Samsung samsung1 = new Samsung("Galaxy", 1000, "White", "5.6 inches");

        System.out.println(samsung1);

        samsung1.faceTime(123456789);
        samsung1.faceTime("harun@gmail.com");
        samsung1.call(123456789);
        samsung1.text(123456789);
    }
}
