package day35_Encapsulation;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(2, 4, 25, true);
        System.out.println(carpet1);

        carpet1.setLength(5);
        System.out.println(carpet1);

        System.out.println(carpet1.isPersian());
        System.out.println(carpet1.getLength());
    }
}
