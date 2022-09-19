package day36_Inheritance.phoneTask;

public class Iphone extends Phone {


    public Iphone(String model, String size, String color, double price) {
        super("Iphone", model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " is face timing with number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is face timing with email " + email);
    }
}
/*
1.2 Create a subclass of Phone named IPhone:
				Variables:
					brand, model, size, price, color
				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */