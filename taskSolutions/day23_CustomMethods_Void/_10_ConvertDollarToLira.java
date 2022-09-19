package day23_CustomMethods_Void;

public class _10_ConvertDollarToLira {

    public static void main(String[] args) {

        dollarToLira(21000);
    }
    public static void dollarToLira(double dollarAmount){
        double lira = dollarAmount * 14.65;
        System.out.println(dollarAmount + " dolar equal to " + lira + " lira");
    }
}
