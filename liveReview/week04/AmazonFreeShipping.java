package week04;

public class AmazonFreeShipping {

    public static void main(String[] args) {

        double totalPrice = 55.50;

        if(totalPrice>=25.0){
            System.out.println("Free shipping eligible. Your order total: $" + totalPrice);
        }else{
            System.out.println("Not eligible for free shipping : $" + totalPrice);
        }
        System.out.println("Thanks for shopping with us!");
    }
}
