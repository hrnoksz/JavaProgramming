package week14.browserPagesInheritance;

public class CartPage extends AmazonHomePage{

    public String buyerInfo;

    public CartPage(String name, String bayerInfo) {
        super(name);
        this.buyerInfo = bayerInfo;
    }

    public void fillInfo(){
        System.out.println("Filling the necessary fields with: " + buyerInfo);
    }

    public void payFor(long cardNumber){
        System.out.println("Paying with credit cart: "+cardNumber);
    }
}
