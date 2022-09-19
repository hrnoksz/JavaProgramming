package day23_CustomMethods_Void;

public class _03_BuyAlcohol {

    public static void main(String[] args) {

        buyAlcohol(18);

    }
    public static  void buyAlcohol(int age){
        if(age >= 21){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }
    }
}
