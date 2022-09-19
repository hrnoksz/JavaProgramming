package week03_Operators;

public class Task {

    public static void main(String[] args) {

        //write an if-else statement to find the greatest number
        int a = 10;
        int b = 20;
        int c = 30;
        String result = "";

        if ((a > b) && (a > c)) {
            result = a + " is greatest";
        } else {
            if (b > c) {
                result = b + " is greatest";
            } else {
                result = c + " is greatest";
            }
            System.out.println("result = " + result);

        }
    }
}
