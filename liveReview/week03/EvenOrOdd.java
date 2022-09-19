package week03;

public class EvenOrOdd {
    public static void main(String[] args) {

        // Task: find if a given integer even number or odd number

        int number = 25;

        boolean condition = number%2==0;

        if(condition){
            System.out.println("The number is EVEN");
        }else{
            System.out.println("The number is ODD");
        }
    }
}
