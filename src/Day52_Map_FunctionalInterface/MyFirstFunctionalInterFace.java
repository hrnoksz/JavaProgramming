package Day52_Map_FunctionalInterface;

@FunctionalInterface
public interface MyFirstFunctionalInterFace {

    void apply(int n); // abstract method name should be generic such as test, function etc.
                       // In functional interface, there should be  ONLY one abstract method

    // void method(); //@FunctionalInterface--> compile error
}
