package week16;

public abstract class Lifting extends Exercise { // an abstract class can be extended another abstract class

    public Lifting(double weight) {
        super(weight);
    }


    /*
    If an abstract class inherits from another abstract class, it doesn't have to implement the abstract methods
     */

    public abstract void endLift();
}
