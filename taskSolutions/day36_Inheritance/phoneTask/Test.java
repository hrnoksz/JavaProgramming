package day36_Inheritance.phoneTask;

public class Test {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("iphone 12", "5.6 inches", "black", 1000);

        Samsung samsung = new Samsung("galaxy S19", "6 inches", "white", 900);

        Nokia nokia = new Nokia("Brik", "4 inches", "pink", 60);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}
