package week16;

public class Swimming extends Exercise{

    public Swimming(double weight) {
        super(weight);
    }

    @Override
    public void perform() {
        System.out.println("Swimming in the pool doing laps");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int) (minutes*11*weight/100);
    }
}
