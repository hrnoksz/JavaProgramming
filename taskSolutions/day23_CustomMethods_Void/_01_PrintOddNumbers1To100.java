package day23_CustomMethods_Void;

public class _01_PrintOddNumbers1To100 {

    public static void main(String[] args){

        printOddNumber();

    }

    public static void printOddNumber(){
        for (int i = 1; i < 100 ; i++) {
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

