package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    static {
        name = "Batch EU8";
    }

    public static void main(String[] args) {

        /*
        Variables in main method are local variables!!!!!!!!!!!!!!!!
         */
        final double pi = 3.14;

        //pi = 4.14; ==> compile error. Because final variables cannot be reassigned.

        final String name;

        name = "Java";

        //name = "Wooden Spoon"; ==> compile error. Because final variables cannot be reassigned.

        System.out.println("------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");

        //obj.birthDay = "June/01"; ==> compile error. Because final variables cannot be reassigned.

        System.out.println(obj.birthDay);

        FinalVariable objOne = new FinalVariable("June/01");

        System.out.println(objOne.birthDay);

        System.out.println("----------------------------------------");

        //FinalVariable.name = "Python"; ==> compile error. Because final variables cannot be reassigned.

        System.out.println(FinalVariable.name);


    }
}
