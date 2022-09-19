package week15.checkedExceptions;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws InterruptedException{

        // 1. try catch
        try {
            Thread.sleep(5000); // throws or causes an InterruptedException, which is a checked exception
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I will move on with my web atumation");

        // 2. Declare using the Throws keyword
        Thread.sleep(5000);
        System.out.println("More automation after 5 more seconds");


    }
}
