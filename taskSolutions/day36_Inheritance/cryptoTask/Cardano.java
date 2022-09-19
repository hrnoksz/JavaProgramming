package day36_Inheritance.cryptoTask;

public class Cardano extends CryptoToken {
    public Cardano(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
