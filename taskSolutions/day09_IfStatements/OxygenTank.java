package day09_IfStatements;

public class OxygenTank {

    public static void main(String[] args) {

        int num =85;
        String message = "";

        if(num >= 90){
            message = "Your tank is full";
        }else if(num >= 80){
            message = "Still okay";
        }else if (num >= 70){
            message = "Don't go too far";
        }else if(num >= 60){
            message = "Start to head back";
        }else if (num >= 50){
            message = "Be careful now you at 50%";
        }else{
            message = "Start to pray";
        }
        System.out.println("message = " + message);

    }
}
/*
Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY

 */