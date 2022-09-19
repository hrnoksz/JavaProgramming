package day44_Abstraction.animalTask;

public interface Playable { // public is ONLY access modifier for interface

    boolean isFriendly = true; // static and final by default. Interface cannot have any blocks. Therefore, we cannot
                                      // use static block in order to initialize static variables. So it must be initialized
                                      // immediately before using of it

   /*
    static void method1(){ // static method accepts only static variables, it doesn't accept instance variables
        System.out.println(isFriendly);
    }

    */


    void play(); // This method is an abstract method (abstract by default).
                 // But it is not needed to use abstract keyword for creating abstract method in interface
                 // abstract keyword is given by default
                 // Interface cannot have instance variables and methods, because interface is not a class.
                 // It is blueprint / template of a class
                 // can have only public access modifier (public by default)
}
