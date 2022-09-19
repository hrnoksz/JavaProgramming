package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("hello");

        sleep(2.5); // throws keyword

        System.out.println("Hello world");

        System.out.println("----------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try & catch ==> we called sleep() method from the MorningWorkOut class

        System.out.println("Cydeo");
    }

    public static void sleep(double seconds) throws InterruptedException { //We use this method in Selenium

        Thread.sleep((long) (seconds * 1000));

    }
}
