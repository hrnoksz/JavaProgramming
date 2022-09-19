package day15_ForLoop;

public class Diamond {

    public static void main(String[] args) {

        for (int i = 1; i <= 8 ; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
1. print the following shape:

		        * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */