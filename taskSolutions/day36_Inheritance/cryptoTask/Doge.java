package day36_Inheritance.cryptoTask;

public class Doge extends CryptoToken{
    public Doge(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
