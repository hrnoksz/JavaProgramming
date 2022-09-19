package day17_While_DoWhile;

public class _10_DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;

        for(int i = 0; a;){
            System.out.println("Wooden Spoon -- for loop");
        }

        while (a){ // There is nothing printed on the console, because condition is false
            System.out.println("Wooden Spoon -- while loop");
        }

        System.out.println("-----------------------------------");

        do{
            System.out.println("Wooden Spoon -- do-while loop");
        }while(a); // condition check is in the second step

    }
}
