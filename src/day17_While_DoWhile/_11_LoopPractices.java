package day17_While_DoWhile;

public class _11_LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        int j = 1;
        while (j <= 10){
            System.out.println(j);
            j++; // iteration must be at the end of loop body
        }

        System.out.println("---------------------------------");
        int k = 1;
        do {
            System.out.println(k);
            k++; //iteration must be at the end of loop body
        }while(k <= 10);
    }
}
