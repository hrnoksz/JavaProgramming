package week12;

public class ValueTest {

    public static void main(String[] args) {

        Value value = new Value();
        // print if I called set Value method
        System.out.println(value.calledMethod);
        //print the parameter without assigning anything
        value.setValue(5);
        System.out.println(value.calledMethod);
        System.out.println(value.getValue());

        Value value1 = new Value(3);
        System.out.println(value1.calledConstructor);
        System.out.println(value1.calledMethod);
        System.out.println(value1.getValue());

    }
}
