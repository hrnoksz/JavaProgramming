package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0); //This is the only time that finally block won't be executed
        }finally {
            System.out.println("Finally Block"); // both catch block and finally block will be executed
        }
        //finally block always get executed. If we don't want to execute finally block, we should put
        // System.exit(0) within catch block

        System.out.println("Hello World"); // Therefore, we place "System.exit(0)" within catch block, "hello world"
                                           // won't be printed


    }
}
