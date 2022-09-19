package constructor;

import day34_GarbageCollection_AccessModifiers.Constructor_vs_StaticBlock;

public class StaticBlock_vs_Constructor {

    static {
        System.out.println("Static Block"); // This prints FIRST on the console ONLY ONE time

    }
    public StaticBlock_vs_Constructor(){
        System.out.println("Constructor"); // in order to print on console, we have to create object from class
        // OTHERWISE this method will be NOT executed.
    }

    public static void main(String[] args) {

        new StaticBlock_vs_Constructor();
        new StaticBlock_vs_Constructor();
        new StaticBlock_vs_Constructor();
        new StaticBlock_vs_Constructor();
        new StaticBlock_vs_Constructor();

    }
}
