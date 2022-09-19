package week15;

public class TryCatchExample {

    public static void main(String[] args) {


        try {
            System.out.println(10/2);
            System.out.println(10/0);
            System.out.println(10/3); // this line is skipped
        }catch (ArithmeticException e){
            e.printStackTrace();
        }





    }
}
