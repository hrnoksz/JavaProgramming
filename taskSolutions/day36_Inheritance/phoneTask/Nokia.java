package day36_Inheritance.phoneTask;

public class Nokia extends Phone{


    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(brand + " " + model + " can be used for self defense");
    }

}
/*
1.4 Create a subclass of Phone named Nokia:
				Variables:
					brand, model, size, price, color
				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */