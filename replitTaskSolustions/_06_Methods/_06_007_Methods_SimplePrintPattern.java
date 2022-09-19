package _06_Methods;

public class _06_007_Methods_SimplePrintPattern {
    public static void main(String[] args) {

        printHollowRect();

    }
    public static void printHollowRect(){
        for (int i = 1; i <=5 ; i++) {
            if(i==1 || i== 5){
                System.out.println("*****");
            }else{
                System.out.println("*   *");
            }
        }
    }
}
/*
Create a method printHollowRect that prints a 5 by 5 hollow rectangle:

*****
*   *
*   *
*   *
*****

hint: you will need to use two nested for loops,
and check if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
 */