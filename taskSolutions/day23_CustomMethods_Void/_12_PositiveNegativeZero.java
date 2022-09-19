package day23_CustomMethods_Void;

public class _12_PositiveNegativeZero {

    public static void main(String[] args) {

        positiveNegativeZero(5);
    }
    public static  void positiveNegativeZero(int number){

        String result = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println(result);
    }
}
