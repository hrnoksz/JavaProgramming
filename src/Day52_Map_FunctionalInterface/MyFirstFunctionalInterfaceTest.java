package Day52_Map_FunctionalInterface;

public class MyFirstFunctionalInterfaceTest {

    public static void main(String[] args) {

        // lambda syntax: () -> {};

        // if functional method in Functional interface has one parameter, using of parenthesis is OPTIONAL,
        // BUT if it does NOT have parameter or have more than ONE parameter, using of parenthesis is MANDATORY.
        // If there is ONLY one statement, using of {} curly braces is OPTIONAL
        // But there are more than one statement, using of {} curly braces is MANDATORY

        //function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterFace oddOrEvenNumber = n -> { // (n)-> parenthesis is OPTIONAL
            if(n%2==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20); //20 is even number

        System.out.println("=========================================================");

        //function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterFace eligibleToBuyAlcohol = (age) -> {
            if(age > 21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(15);

        System.out.println("=========================================================");

        //function3: create a function that can display the cube of a number
        MyFirstFunctionalInterFace printCube;
        printCube = n -> System.out.println(n*n*n);
        printCube.apply(3);

        System.out.println("========================================================");
        //function4: create a function that can check if a number evenly divisible by 3 & 5
        MyFirstFunctionalInterFace divisibleBy3And5 = n -> {
            if(n%15 == 0){
                System.out.println(n + " is divisible by 3 and 5");
            }else{
                System.out.println(n + " is not divisible by 3 and 5");
            }
        };
        divisibleBy3And5.apply(60);
    }
}
