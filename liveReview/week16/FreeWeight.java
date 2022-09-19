package week16;

public class FreeWeight extends Lifting{
    public FreeWeight(double weight) {
        super(weight);
    }


    //How many methods does this class implement?

    @Override
    public void perform() {
        System.out.println("Lifting Free Weight with dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int) (minutes*6*weight/100);
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumb");
    }
}
