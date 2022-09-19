package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte num1 = (byte)averageScore; // explicit casting is used for casting larger type to smaller type
        short num2 = (short) averageScore;
        int num3 = (int) averageScore;
        long num4 = (long) averageScore;
        float num5 = averageScore; // there is no casting
        double num6 = averageScore; // implicit casting is used for casting smaller type to larger type

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

    }
}
/*
1. create a class named Castings
   1.1 declare a variable of float named averageScore and initialize it to 20.5
   1.2 declare the following variables and assign averageScore to each of them:
       byte num1;
       short num2;
       int num3;
       long num4;
       float num5
       double num6;
 */