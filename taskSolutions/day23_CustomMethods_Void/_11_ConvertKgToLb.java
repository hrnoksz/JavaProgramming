package day23_CustomMethods_Void;

public class _11_ConvertKgToLb {

    public static void main(String[] args) {

        kgToLb(1000);

    }
    public static void kgToLb(double kg){
        double lb = kg * 2.205;
        System.out.println(kg + " kg equal to " + lb + " pounds");
    }
}
