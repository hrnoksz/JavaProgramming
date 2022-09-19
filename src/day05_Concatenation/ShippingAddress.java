package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
        /*
        String name = "James";
        String buildingNumber = "1123B";
         */

        String name = "Harun Oksuz",
                buildingNumber = "B2-5",
                streetName = "Dogukent",
                city = "Ankara",
                state = "Turkey",
                zipCode = "06700A";
        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        /*
        String name = "James King";
        String buildingNumber = "11821B";
        String streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "22031A";
         */

        System.out.println(address);
    }
}
