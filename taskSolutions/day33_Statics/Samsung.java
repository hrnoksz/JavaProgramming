package day33_Statics;

public class Samsung {

    public String model;
    public double price;
    public String color;
    public String size;

    public static String brand = "Samsung", OS = "Android", madeIn = "South Korea";

    public Samsung(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }
    public void faceTime(long phoneNumber){
        System.out.println(model+" is face timing with number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is face timing with email " + email);
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting to " + phoneNumber);
    }

    public String toString() {
        return "Samsung{" +
                "model='" + model + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */