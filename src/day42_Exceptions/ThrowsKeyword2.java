package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) {

        System.out.println("Test started");
        try {
            System.out.println(8/0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test completed");
        /*
        throws keyword cannot be used for handling unchecked exceptions!!!!!!!!!!!!!!!
        So in order to handle unchecked exceptions, we use ONLY try and catch block
        But in order to handle checked exceptions, we use both try&catch block and throws keyword
        using of throws keyword is the fastest way. But it doesn't mean the best way. It is only temporary solution.
        The best way to handle checked exception is using of try&catch block
         */
    }
}
