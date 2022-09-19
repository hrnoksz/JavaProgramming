package week07;

public class _04_CrayzLoop {

    public static void main(String[] args) {

        int rowCount = 5;
        for (int row = 1; row <=rowCount ; row++) {

            int value = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(value+" ");
                value += rowCount - col; // adding 4 for col=1,
            }
            System.out.println();
        }



    }


}
/*
Print below pattern using loop

            1
            2 6
            3 7 10
            4 8 11 13
            5 9 12 14 15

            rows : 5
            colums:5
 */