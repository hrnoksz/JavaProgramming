package week06;

public class _04_PrintAllLetters {

    public static void main(String[] args) {

        //print all letters from A to Z
        // char A--in ASCII table is value 65, Z is 90
        // how can I turn integer into char: explicitly casting
        // Solution1:
        for (int i = 65; i <=90 ; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------");

        // Solution2:
        // chars are also iterable
        for (char c = 'A'; c <= 'Z' ; c++) {
            System.out.print(c+" ");
        }
        System.out.println();
    }
}
