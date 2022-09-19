package day19_LoopPractice;

public class _04_ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { //i: 0, 1, 2, 3, 4
            if(i == 3){ // terminates the loop
                break;
            }
            System.out.println(i); // 0 1 2
        }

        System.out.println("Wooden Spoon");

        System.out.println("---------------------------");

        for (int i = 0; i < 5; i++) {
            if(i == 3){
                continue; // terminates the current iteration of the loop
            }
            System.out.println(i); // 0 1 2 4
        }
        System.out.println("Wooden Spoon");

        System.out.println("--------------------------------------");

        for (int i = 0; i < 5; i++) {
            if(i == 3){
                System.exit(0); // terminates the program
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon"); // When we use System.exit(0), then this line will be not executed.

    }
}
