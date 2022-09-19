package week10;

public class _05_MethodOverloading {

    public static void main(String[] args) {

        double centimeter = convertBritishToMetric(5, 11);
        System.out.println(centimeter);

        System.out.println(convertBritishToMetric(71));
    }

    public static double convertBritishToMetric(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.err.println("Invalid feet or inches");
            return -1.0;
        }
        return feet * 12 * 2.54 + inches * 2.54;
    }

    public static double convertBritishToMetric(double inches) {
        if (inches < 0) {
            System.err.println("Invalid inches");
            return -1.0;
        }
        return inches * 2.54;
    }
}
