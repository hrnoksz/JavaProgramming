package day33_Statics;

public class AddressTest {

    public static void main(String[] args) {

        Address address = new Address(7925, "Jones Branch Dr", "McLean", "VA", "22012");

        System.out.println(address);

        System.out.println(address.planet);
        System.out.println(address.country);
    }
}
