package day37_Inheritance.phoneTask;

public class Phone { //parent class: only contains the common features of all the subclasses.

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    static{
        hasBattery = true;
    }

    public void call(long phoneNumber){
        System.out.println(brand +" "+model+" is calling" +phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand +" "+model+ " is texting"+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' + // we add static variable manually
                '}';
    }
}
/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color (instance variables)
                    hasBattery (static variable)

				Add constructor to set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

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

		1.3 Create a subclass of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

		1.4 Create a subclass of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

		1.5 Create a class named Phone Objects and test of the subclass' objects
 */