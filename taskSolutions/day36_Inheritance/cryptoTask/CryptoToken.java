package day36_Inheritance.cryptoTask;

public class CryptoToken {

    private double price;
    private int quantity;
    private long marketCap;
    private long circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price < 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        if(quantity < 0){
            System.err.println("Invalid quantity: " + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public long getMarketCap(){
        return marketCap;
    }

    public void setMarketCap(long marketCap){
        this.marketCap = marketCap;
    }

    public long getCirculatingSupply(){
        return circulatingSupply;
    }

    public void setCirculatingSupply(){
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable(){
        return isMineable;
    }

    public void setMineable(boolean isMineable){
        this.isMineable = isMineable;
    }

    public double totalPrice(){
        return price * quantity;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ", total price=" + totalPrice() +
                '}';
    }
}
/*
variables:
		price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

		methods:
			setInfo()
			toString()
			totalPrice(): returns the total price of the crypto token ( price * quantity)
 */