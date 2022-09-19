package week16;

public class AtTheGym {

    public static void main(String[] args) {

        //Exercise exercise = new Exercise(); you cannot be instantiated.

        Running running = new Running(90);
        Swimming swimming = new Swimming(90);
        FreeWeight freeWeight = new FreeWeight(90);

        running.start();
        running.perform();
        System.out.println("Running for 15 minutes-calories: " +running.getCaloriesCount(15));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming for 15 minutes-calories: " +swimming.getCaloriesCount(15));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Free weight for 15 minutes-calories: " +freeWeight.getCaloriesCount(15));




        //Polymorphism
        // Exercise polyObject = new Running(); next week topic
    }
}
