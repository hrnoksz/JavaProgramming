package day23_CustomMethods_Void;

public class _02_PrintEvenNumbers1To100 {

    public static void main(String[] args) {

        printEvenNumber();

    }
    public static void printEvenNumber(){
        for (int i = 1; i < 100; i++) {
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
