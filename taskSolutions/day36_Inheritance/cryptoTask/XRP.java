package day36_Inheritance.cryptoTask;

public class XRP extends CryptoToken{
    public XRP(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
