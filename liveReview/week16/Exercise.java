package week16;

public abstract class Exercise {

    double weight;
    // You do not have to have abstract method at all, and you can still declare your class as abstract


    public Exercise(double weight) {
        this.weight = weight;
    }

    public void start(){
        System.out.println("Warming up and starting exercise");
    }
/*
abstract methods: no body, no implementation, subclasses will ***OVERRIDE***
just have the signature part
less code
 */
    public abstract void perform();

    public abstract int getCaloriesCount(int minutes);
/*
we can say that abstract method is an overridden method.
 */
}
