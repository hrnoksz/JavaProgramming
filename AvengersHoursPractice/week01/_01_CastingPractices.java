package week01;

public class _01_CastingPractices {

    public static void main(String[] args) {

        // byte short int long float double

        // byte to short
        byte b = 10;
        short s = b; //implicit casting

        // double to integer
        double d = 5.3;
        int i = (int) d; // there might be data loss, so the compiler asks yo to specify the command
    }
}
