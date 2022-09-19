package week02;

public class CarInfo {

    public static void main(String[] args) {

        // I want you to give example of the car That you will buy after you find a well paid job.

        int year = 2022;
        String make = "Audi";
        String model = "A6";
        // automatic = true; manual = false;
        boolean transmission = true;
        String color = "black";
        int milage = 0;
        int price = 100_000; // for Europe

        System.out.println(year + " " +make+" "+model+"\nAutomatic Transmission: " + transmission);
        System.out.println(color+"|"+milage+" kilometers|"+price+"Euros");

        // let's turn this value into TL 1 Euro = 15.5 TL

        double priceInTL = price * 15.5;
        double taxRate = 1.80;
        double priceAfterTaxTL = priceInTL + (priceInTL*taxRate);
        System.out.println("priceAfterTaxTL = " + priceAfterTaxTL);

        // Variables are used, because it makes our data reusable and maintainable

    }
}
