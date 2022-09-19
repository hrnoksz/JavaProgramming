package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static Block"); // This prints FIRST on the console ONLY ONE time

    }
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor"); // in order to print on console, we have to create object from class
                                           // OTHERWISE this method will be NOT executed.
    }

    public static void main(String[] args) {

       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
    }
}
