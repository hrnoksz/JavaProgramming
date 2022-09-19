package week18.poly_demo;

import java.io.File;

public class SupermenTest {

    public static void main(String[] args) {

        //polymorphism
        //Interface/parent class RN = ChildClass

        Parent superManOne = new Father();
        //You can reach parent abstract class' methods
        //Because reference type decides what methods can be accessed
        superManOne.feedKid();
        superManOne.playWithKid();
        superManOne.playWithKid();
        //superManOne.work("SDET"); //ERROR because superManOne is type of parent abstract class

        Worker superManTwo = new Father();  //You can reach interface's methods, because reference type is Worker
        superManTwo.getPaid();
        superManTwo.work("SDET");

        Father superManThree = new Father();
        superManThree.feedKid();
        superManThree.playWithKid();
        superManThree.playWithKid();
        superManThree.getPaid();
        superManThree.work("QA");

        //Explicit-casting examples
        ((Worker) superManOne).work("Engineer");
        ((Worker) superManOne).getPaid();

        ((Parent)superManTwo).raiseKid();
        ((Parent)superManTwo).playWithKid();
        ((Parent)superManTwo).feedKid();



    }
}
