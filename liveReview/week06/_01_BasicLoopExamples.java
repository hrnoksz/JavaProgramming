package week06;

public class _01_BasicLoopExamples {

    public static void main(String[] args) {

        for (int i = 0; i < 1001; i+=10) { //i: local variable, only works inside for loop
            System.out.print(i + " ");
        }
        System.out.println();

        //==================================================
        //initialization
        int z = 0; // global variable for the whole class
        for (  ; z <= 1000;  ){
            if(z%10==0){
                System.out.print(z+" ");
            }
            z++;
        }
        /*
        difference: if we make the initialization outside the for loop, the variable z can be used within the entire
        class. Or when the initialization is made within the loop as usual, then the z only belongs to the loop
         */


    }
}
/*
Write a for loop that displays the following set of numbers
0, 10, 20, 30, 40, 50,...1000
 */