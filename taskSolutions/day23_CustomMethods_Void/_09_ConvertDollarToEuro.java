package day23_CustomMethods_Void;

public class _09_ConvertDollarToEuro {

    public static void main(String[] args) {

        dollarToEuro(200);

    }
    public static void dollarToEuro(double dollarAmount){
        double euro = dollarAmount * 1.09;
        System.out.println(dollarAmount + " dollar equal to " + euro + " euro");
    }
}
