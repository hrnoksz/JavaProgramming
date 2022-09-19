package week01;

public class StringManipulatorTest {

    public static void main(String[] args) {

        StringManipulator objectOne = new StringManipulator("Java");
        System.out.println(objectOne.str);

        StringManipulator objectTwo = new StringManipulator("selenium");
        System.out.println(objectTwo.str);

        objectOne.firstTwoChars(); // called the method--> I want my method do the action
        System.out.println(objectOne.str);
        System.out.println(objectTwo.str);

        //call the method with our second object
        String password = objectTwo.tripler();
        System.out.println("password = " + password);


    }
}
